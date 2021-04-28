package priv.ljh.uniapp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 寻物类别
 * </p>
 * contact: "fdsf"
 * gid: "222"
 * imgdesc: "das"
 * imgname: "1"
 * lostname: "dsd"
 * status: "23"
 *
 * @author lijinghai
 * @since 2021-02-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Category对象", description="寻物类别")
public class Found implements Serializable {


    @ApiModelProperty(value = "状态")
    private String contact;

    @ApiModelProperty(value = "操作")
    private String gid;

    @ApiModelProperty(value = "ID")
    private String imgdesc;

    @ApiModelProperty(value = "姓名")
    private String imgname;

    @ApiModelProperty(value = "联系方式")
    private String lostname;

    @ApiModelProperty(value = "班级")
    private String status;
}
