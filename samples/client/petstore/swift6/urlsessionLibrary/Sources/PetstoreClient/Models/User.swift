//
// User.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

@available(*, deprecated, renamed: "PetstoreClientAPI.User")
public typealias User = PetstoreClientAPI.User

extension PetstoreClientAPI {

public final class User: @unchecked Sendable, Codable, JSONEncodable, Hashable {

    public private(set) var id: Int64?
    public private(set) var username: String?
    public private(set) var firstName: String?
    public private(set) var lastName: String?
    public private(set) var email: String?
    public private(set) var password: String?
    public private(set) var phone: String?
    /** User Status */
    public private(set) var userStatus: Int?

    public init(id: Int64? = nil, username: String? = nil, firstName: String? = nil, lastName: String? = nil, email: String? = nil, password: String? = nil, phone: String? = nil, userStatus: Int? = nil) {
        self.id = id
        self.username = username
        self.firstName = firstName
        self.lastName = lastName
        self.email = email
        self.password = password
        self.phone = phone
        self.userStatus = userStatus
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case id
        case username
        case firstName
        case lastName
        case email
        case password
        case phone
        case userStatus
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(id, forKey: .id)
        try container.encodeIfPresent(username, forKey: .username)
        try container.encodeIfPresent(firstName, forKey: .firstName)
        try container.encodeIfPresent(lastName, forKey: .lastName)
        try container.encodeIfPresent(email, forKey: .email)
        try container.encodeIfPresent(password, forKey: .password)
        try container.encodeIfPresent(phone, forKey: .phone)
        try container.encodeIfPresent(userStatus, forKey: .userStatus)
    }

    public static func == (lhs: User, rhs: User) -> Bool {
        lhs.id == rhs.id &&
        lhs.username == rhs.username &&
        lhs.firstName == rhs.firstName &&
        lhs.lastName == rhs.lastName &&
        lhs.email == rhs.email &&
        lhs.password == rhs.password &&
        lhs.phone == rhs.phone &&
        lhs.userStatus == rhs.userStatus
        
    }

    public func hash(into hasher: inout Hasher) {
        hasher.combine(id?.hashValue)
        hasher.combine(username?.hashValue)
        hasher.combine(firstName?.hashValue)
        hasher.combine(lastName?.hashValue)
        hasher.combine(email?.hashValue)
        hasher.combine(password?.hashValue)
        hasher.combine(phone?.hashValue)
        hasher.combine(userStatus?.hashValue)
        
    }
}

}

@available(iOS 13, tvOS 13, watchOS 6, macOS 10.15, *)
extension PetstoreClientAPI.User: Identifiable {}
