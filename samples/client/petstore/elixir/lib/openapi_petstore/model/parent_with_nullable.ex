# NOTE: This file is auto generated by OpenAPI Generator 7.7.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Model.ParentWithNullable do
  @moduledoc """
  
  """

  @derive Jason.Encoder
  defstruct [
    :type,
    :nullableProperty
  ]

  @type t :: %__MODULE__{
    :type => String.t | nil,
    :nullableProperty => String.t | nil
  }

  def decode(value) do
    value
  end
end

