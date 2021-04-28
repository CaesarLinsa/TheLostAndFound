import request from "@/utils/request";

export function finduserlist() {
  return request({
    url: '/uer/list',
    method: 'get'
  })
}
