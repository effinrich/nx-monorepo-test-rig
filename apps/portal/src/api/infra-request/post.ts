import {
  CompanySummary,
  InfraRequestSummary
} from '@acmehealth/company-api-types'
import { axiosApi } from '@acmehealth/portal/data-assets'
import { parseRequest } from '@acmehealth/portal/utils'

export const createInfraRequest = async (companyId: CompanySummary['id']) => {
  const { error, response } = await parseRequest<InfraRequestSummary>(
    axiosApi.post(`/infra-request/${companyId}/submit`)
  )

  if (error) throw error

  return response.data
}
