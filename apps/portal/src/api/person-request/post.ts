import {
  PersonRequestCommand,
  PersonRequestSummary
} from '@acmehealth/company-api-types'
import { axiosApi } from '@acmehealth/portal/data-assets'
import { parseRequest } from '@acmehealth/portal/utils'

export const createPersonRequest = async (body: PersonRequestCommand) => {
  const { error, response } = await parseRequest<PersonRequestSummary>(
    axiosApi.post('/person-request', body)
  )

  if (error) throw error
  return response.data
}
