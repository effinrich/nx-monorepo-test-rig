import {
  CompanySummary,
  EntityModelMapObjectObject,
  PersonSummary
} from '@acmehealth/company-api-types'
import { axiosApi } from '@acmehealth/portal/data-assets'
import { parseRequest } from '@acmehealth/portal/utils'

export const removeCompanyMember = async (
  companyId: CompanySummary['id'],
  personEmail: PersonSummary['email']
) => {
  const { error, response } = await parseRequest<EntityModelMapObjectObject>(
    axiosApi.delete(`/company/${companyId}/member/${personEmail}`)
  )

  if (error) throw error
  return response.data
}
