import {
  CompanySummary,
  InfraRequestCommand,
  InfraRequestSummary,
  RequestFormCommand
} from '@acmehealth/company-api-types'
import { axiosApi } from '@acmehealth/portal/data-assets'
import { parseRequest } from '@acmehealth/portal/utils'

export const updateInfraRequestStatus = async (
  companyId: CompanySummary['id'],
  body: InfraRequestCommand
) => {
  const { error, response } = await parseRequest<InfraRequestSummary>(
    axiosApi.put(`/infra-request/${companyId}`, body)
  )

  if (error) throw error
  return response.data
}

export const updateInfraRequestForm = async (
  companyId: CompanySummary['id'],
  formType: 'TECH_STACK' | 'PRIVACY_QUESTIONNAIRE',
  body: RequestFormCommand
) => {
  const { error, response } = await parseRequest<InfraRequestSummary>(
    axiosApi.put(`/infra-request/${companyId}/form/${formType}`, body)
  )

  if (error) throw error
  return response.data
}
