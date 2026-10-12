import { render } from '@acmehealth/shared-utils-jest'

import { Code } from './code'

describe('Code', () => {
  it('should render successfully', () => {
    const { baseElement } = render(<Code />)
    expect(baseElement).toBeTruthy()
  })
})
