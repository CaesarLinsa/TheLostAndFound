import request from "@/utils/request";

export function createArticle(data) {
  return request({
    url: '/found',
    method: 'post',
    data
  })
}

export function updateArticle(data) {
  return request({
    url: '/found',
    method: 'put',
    data
  })
}
