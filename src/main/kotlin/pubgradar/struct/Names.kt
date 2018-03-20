package pubgradar.struct

val Names = mutableMapOf(
    // Special zero value, meaning no name.
    0 to "None",

// Class property types (name indices are significant for serialization).
    1 to "ByteProperty",
    2 to "IntProperty",
    3 to "BoolProperty",
    4 to "FloatProperty",
    5 to "ObjectProperty", // ClassProperty shares the same tag
    6 to "NameProperty",
    7 to "DelegateProperty",
    8 to "DoubleProperty",
    9 to "ArrayProperty",
    10 to "StructProperty",
    11 to "VectorProperty",
    12 to "RotatorProperty",
    13 to "StrProperty",
    14 to "TextProperty",
    15 to "InterfaceProperty",
    16 to "MulticastDelegateProperty",
//17 to "Available",
    18 to "LazyObjectProperty",
    19 to "SoftObjectProperty", // SoftClassProperty shares the same tag
    20 to "UInt64Property",
    21 to "UInt32Property",
    22 to "UInt16Property",
    23 to "Int64Property",
    25 to "Int16Property",
    26 to "Int8Property",
//27 to "Available",
    28 to "MapProperty",
    29 to "SetProperty",

// Special packages.
    30 to "Core",
    31 to "Engine",
    32 to "Editor",
    33 to "CoreUObject",

// More class properties
    34 to "EnumProperty",

// Special types.
    50 to "Cylinder",
    51 to "BoxSphereBounds",
    52 to "Sphere",
    53 to "Box",
    54 to "Vector2D",
    55 to "IntRect",
    56 to "IntPoint",
    57 to "Vector4",
    58 to "Name",
    59 to "Vector",
    60 to "Rotator",
    61 to "SHVector",
    62 to "Color",
    63 to "Plane",
    64 to "Matrix",
    65 to "LinearColor",
    66 to "AdvanceFrame",
    67 to "Pointer",
    68 to "Double",
    69 to "Quat",
    70 to "Self",
    71 to "Transform",

// Object class names.
    100 to "Object",
    101 to "Camera",
    102 to "Actor",
    103 to "ObjectRedirector",
    104 to "ObjectArchetype",
    105 to "Class",
    106 to "ScriptStruct",
    107 to "Function",

// Misc.
    200 to "State",
    201 to "TRUE",
    202 to "FALSE",
    203 to "Enum",
    204 to "Default",
    205 to "Skip",
    206 to "Input",
    207 to "Package",
    208 to "Groups",
    209 to "Interface",
    210 to "Components",
    211 to "Global",
    212 to "Super",
    213 to "Outer",
    214 to "Map",
    215 to "Role",
    216 to "RemoteRole",
    217 to "PersistentLevel",
    218 to "TheWorld",
    219 to "PackageMetaData",
    220 to "InitialState",
    221 to "Game",
    222 to "SelectionColor",
    223 to "UI",
    224 to "ExecuteUbergraph",
    225 to "DeviceID",
    226 to "RootStat",
    227 to "MoveActor",
    230 to "All",
    231 to "MeshEmitterVertexColor",
    232 to "TextureOffsetParameter",
    233 to "TextureScaleParameter",
    234 to "ImpactVel",
    235 to "SlideVel",
    236 to "TextureOffset1Parameter",
    237 to "MeshEmitterDynamicParameter",
    238 to "ExpressionInput",
    239 to "Untitled",
    240 to "Timer",
    241 to "Team",
    242 to "Low",
    243 to "High",
    244 to "NetworkGUID",
    245 to "GameThread",
    246 to "RenderThread",
    247 to "OtherChildren",
    248 to "Location",
    249 to "Rotation",
    250 to "BSP",
    251 to "EditorSettings",
    252 to "AudioThread",
    253 to "ID",

// Online
    280 to "DGram",
    281 to "Stream",
    282 to "GameNetDriver",
    283 to "PendingNetDriver",
    284 to "BeaconNetDriver",
    285 to "FlushNetDormancy",
    286 to "DemoNetDriver",
    287 to "GameSession",
    288 to "PartySession",
    289 to "GamePort",
    290 to "BeaconPort",

// Texture settings.
    300 to "Linear",
    301 to "Point",
    302 to "Aniso",
    303 to "LightMapResolution",

// Sound.
//REGISTER_NAME(310,)
    311 to "UnGrouped",
    312 to "VoiceChat",

// Optimized replication.
    320 to "Playing",
    322 to "Spectating",
    325 to "Inactive",

// Log messages.
    350 to "PerfWarning",
    351 to "Info",
    352 to "Init",
    353 to "Exit",
    354 to "Cmd",
    355 to "Warning",
    356 to "Error",

// File format backwards-compatibility.
    400 to "FontCharacter",
    401 to "InitChild2StartBone",
    402 to "SoundCueLocalized",
    403 to "SoundCue",
    404 to "RawDistributionFloat",
    405 to "RawDistributionVector",
    406 to "InterpCurveFloat",
    407 to "InterpCurveVector2D",
    408 to "InterpCurveVector",
    409 to "InterpCurveTwoVectors",
    410 to "InterpCurveQuat",
    
    450 to "AI",
    451 to "NavMesh",
    
    500 to "PerformanceCapture",

// Special config names - not required to be consistent for network replication
    600 to "EditorLayout",
    601 to "EditorKeyBindings",
    602 to "NAME_MaxHardcodedNameIndex"
)