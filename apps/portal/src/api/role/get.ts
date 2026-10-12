import { CollectionModelRole } from '@acmehealth/company-api-types'
import { axiosApi } from '@acmehealth/portal/data-assets'
import { parseRequest } from '@acmehealth/portal/utils'

export const getRoles = async () => {
  const { error, response } = await parseRequest<CollectionModelRole>(
    axiosApi.get('/me/role')
  )

  if (error) throw error
  return response.data
}
