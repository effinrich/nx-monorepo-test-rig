import { UserInfoSummary } from '@acmehealth/company-api-types'
import { axiosApi } from '@acmehealth/portal/data-assets'
import { parseRequest } from '@acmehealth/portal/utils'

export const getUserInfo = async () => {
  const { error, response } = await parseRequest<UserInfoSummary>(
    axiosApi.get('/userinfo')
  )

  if (error) throw error
  return response.data
}
