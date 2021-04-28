<template>
  <div class="app-container">
    <div class="filter-container">


      <el-form ref="dataForm"  :model="temp" label-position="left" label-width="110px" style="width: 400px; margin-left:150px;">

        <el-form-item :lable="$t('table.imgdeac')" prop="imgdesc">
          <span slot="label">ID：</span>
          <el-input v-model="temp.imgdesc" />
        </el-form-item>

        <el-form-item :lable="imgname" prop="imgname">
          <span slot="label">姓名：</span>
          <el-input v-model="temp.imgname" />
        </el-form-item>

        <el-form-item :lable="$t('table.status')" prop="status">
          <span slot="label">班级：</span>
          <el-input v-model="temp.status" />
        </el-form-item>

        <el-form-item :lable="$t('table.lostname')" prop="lostname">
          <span slot="label">联系方式：</span>
          <el-input v-model="temp.lostname" />
        </el-form-item>

        <el-form-item :lable="$t('table.contact')" prop="contact">
          <span slot="label">状态：</span>
          <el-input v-model="temp.contact" />
        </el-form-item>

        <el-form-item :lable="$t('table.gid')" prop="gid">
          <span slot="label">操作：</span>
          <el-input v-model="temp.gid" />
        </el-form-item>
      </el-form>

      <el-button class="filter-item" style="margin-left: 10px;" type="primary" icon="el-icon-edit" @click="handleCreate">
        {{ $t('table.add') }}
      </el-button>
    </div>
  </div>
</template>

<script>
import { createArticle } from "@/api/found";

export default {
  name: "found",
  data() {
    return {
      temp: {
        imgdesc: '',
        imgname: '',
        status: '',
        lostname: '',
        contact: '',
        gid: '',

      }
    }
  },
  methods:{
    handleCreate(){
      createArticle(this.temp).then(response => {
        console.log(response)
      })
    },
  }
}
</script>

<style scoped>
</style>
