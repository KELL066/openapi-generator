//
// MixedPropertiesAndAdditionalPropertiesClass.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

public struct MixedPropertiesAndAdditionalPropertiesClass: Sendable, Codable, JSONEncodable, Hashable {

    public var uuid: UUID?
    public var dateTime: Date?
    public var map: [String: Animal]?

    public init(uuid: UUID? = nil, dateTime: Date? = nil, map: [String: Animal]? = nil) {
        self.uuid = uuid
        self.dateTime = dateTime
        self.map = map
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case uuid
        case dateTime
        case map
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(uuid, forKey: .uuid)
        try container.encodeIfPresent(dateTime, forKey: .dateTime)
        try container.encodeIfPresent(map, forKey: .map)
    }
}

