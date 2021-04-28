<template>
  <el-table
    :key="tableKey"
    v-loading="listLoading"
    :data="flist"
    border
    fit
    highlight-current-row
    style="width: 100%;"
    @sort-change="sortChange"
  >
    <el-table-column label="ID" prop="id" sortable="custom" align="center" width="90" :class-name="getSortClass('id')">
      <template slot-scope="{row}">
        <span>{{ row.id }}</span>
      </template>
    </el-table-column>
    <el-table-column label="姓名" width="120px" align="center">
      <template slot-scope="{row}">
        <span>{{ row.username }}</span>
      </template>
    </el-table-column>
    <el-table-column label="密码" width="120px" align="center">
      <template slot-scope="{row}">
        <span>{{ row.password }}</span>
      </template>
<!--    </el-table-column>-->
<!--    <el-table-column label="专业" width="120px" align="center">-->
<!--      <template slot-scope="{row}">-->
<!--        <span>{{ row.profession }}</span>-->
<!--      </template>-->
<!--    </el-table-column>-->
<!--    <el-table-column label="物品名" width="120px" align="center">-->
<!--      <template slot-scope="{row}">-->
<!--        <span>{{ row.article }}</span>-->
<!--      </template>-->
<!--    </el-table-column>-->
<!--    <el-table-column label="电话号码" width="140px" align="center">-->
<!--      <template slot-scope="{row}">-->
<!--        <span>{{ row.phoneNum }}</span>-->
<!--      </template>-->
<!--    </el-table-column>-->

<!--    <el-table-column label="创建时间" type="date" width="270px" align="center">-->
<!--      <template slot-scope="{row}">-->
<!--        <span>{{ row.createTime | parseTime('{y}-{m}-{d} {h}:{i}:{s}') }}</span>-->
<!--      </template>-->
<!--    </el-table-column>-->

<!--    <el-table-column label="更新时间" type="date" width="270px" align="center">-->
<!--      <template slot-scope="{row}">-->
<!--        <span>{{ row.updateTime | parseTime('{y}-{m}-{d} {h}:{i}:{s}') }}</span>-->
<!--      </template>-->
<!--    </el-table-column>-->
<!--    <el-table-column :label="$t('table.actions')" align="center" width="400" class-name="small-padding fixed-width">-->
<!--      <template slot-scope="{row,$index}">-->
<!--        <el-button type="primary" size="mini" @click="handleUpdate(row)">-->
<!--          {{ $t('table.edit') }}-->
<!--        </el-button>-->
<!--        <el-button v-if="row.status!='deleted'" size="mini" type="danger" @click="handleDelete(row,$index)">-->
<!--          {{ $t('table.delete') }}-->
<!--        </el-button>-->
<!--      </template>-->
    </el-table-column>-->
  </el-table>

</template>

<script>
import {finduserlist} from '@/api/foundlist'
import {createArticle} from "@/api/found";
export default {
  name: "foundlist",
  data(){
    return{
      tableKey: 0,
      list: null,
      listLoading: true,
      flist: [],
      listQuery: {
        page: 1,
        limit: 10,
        id: undefined,
        username: '',
        password: '',
        profession: '',
        article: '',
        phoneNum: '',
        createTime: new Date(),
        updateTime: new Date(),
        // importance: undefined,
        // title: undefined,
        // id: undefined,
        // type: undefined,
        sort: '+id'
      },
    }
  },
  methods:{
    getSortClass: function(key) {
      const sort = this.listQuery.sort
      return sort === `+${key}` ? 'ascending' : 'descending'
    },
    sortChange(data) {
      const {prop, order} = data
      if (prop === 'id') {
        this.sortByID(order)
      }
    }
  },
  created() {
    // this.flist = [{id: 5623908, username: '古古', password: '15667061521'}, {
    //   id: 553456,
    //   username: '小小',
    //   password: '110'
    // }, {id: 123456, username: '钉钉', password: '999'}]
    finduserlist().then(response => {
      console.log(response)
      this.listLoading = false
    })


  }
}
</script>

<style scoped>

</style>
