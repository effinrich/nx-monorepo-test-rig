import { render } from '@acmehealth/shared-utils-jest'

import { DesignSystemLogo } from './design-system-logo'

describe('DesignSystemLogo', () => {
  it('should render successfully', () => {
    const { baseElement } = render(<DesignSystemLogo />)
    expect(baseElement).toBeTruthy()
  })
})
