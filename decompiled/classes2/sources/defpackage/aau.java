package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aau {
    public static final /* synthetic */ int a = 0;
    private static final java.util.Map b;
    private static final java.util.Map c;
    private static final java.util.Map d;

    static {
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        arrayMap.put(java.lang.Boolean.class, "bool");
        arrayMap.put(java.lang.Byte.class, "byte");
        arrayMap.put(java.lang.Short.class, "short");
        arrayMap.put(java.lang.Integer.class, "int");
        arrayMap.put(java.lang.Long.class, "long");
        arrayMap.put(java.lang.Double.class, "double");
        arrayMap.put(java.lang.Float.class, "float");
        arrayMap.put(java.lang.String.class, "string");
        arrayMap.put(android.os.Parcelable.class, "parcelable");
        arrayMap.put(java.util.Map.class, "map");
        arrayMap.put(java.util.List.class, "list");
        arrayMap.put(androidx.core.graphics.drawable.IconCompat.class, "image");
        b = arrayMap;
        android.util.ArrayMap arrayMap2 = new android.util.ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        c = arrayMap2;
        d = new java.util.HashMap();
    }

    private aau() {
    }

    public static android.os.Bundle a(java.lang.Object obj, java.lang.String str, defpackage.aas aasVar) throws defpackage.aaq {
        android.os.Bundle bundle;
        if (obj != null) {
            java.util.Iterator it = aasVar.a.iterator();
            while (it.hasNext()) {
                if (((defpackage.aar) it.next()).a == obj) {
                    throw new defpackage.aaq("Found cycle while bundling type ".concat(java.lang.String.valueOf(obj.getClass().getSimpleName())), aasVar);
                }
            }
        }
        defpackage.aas aasVarB = defpackage.aas.b(obj, str, aasVar);
        try {
            if (obj == null) {
                throw new defpackage.aat("Bundling of null object is not supported", aasVarB);
            }
            if (obj instanceof androidx.core.graphics.drawable.IconCompat) {
                bundle = new android.os.Bundle(2);
                bundle.putInt("tag_class_type", 6);
                bundle.putBundle("tag_value", ((androidx.core.graphics.drawable.IconCompat) obj).d());
            } else {
                boolean z = obj instanceof java.lang.Boolean;
                int i = 0;
                if (z || (obj instanceof java.lang.Byte) || (obj instanceof java.lang.Character) || (obj instanceof java.lang.Short) || (obj instanceof java.lang.Integer) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.Double) || (obj instanceof java.lang.Float) || (obj instanceof java.lang.String) || (obj instanceof android.os.Parcelable)) {
                    android.os.Bundle bundle2 = new android.os.Bundle(2);
                    bundle2.putInt("tag_class_type", 0);
                    if (z) {
                        bundle2.putBoolean("tag_value", ((java.lang.Boolean) obj).booleanValue());
                    } else if (obj instanceof java.lang.Byte) {
                        bundle2.putByte("tag_value", ((java.lang.Byte) obj).byteValue());
                    } else if (obj instanceof java.lang.Character) {
                        bundle2.putChar("tag_value", ((java.lang.Character) obj).charValue());
                    } else if (obj instanceof java.lang.Short) {
                        bundle2.putShort("tag_value", ((java.lang.Short) obj).shortValue());
                    } else if (obj instanceof java.lang.Integer) {
                        bundle2.putInt("tag_value", ((java.lang.Integer) obj).intValue());
                    } else if (obj instanceof java.lang.Long) {
                        bundle2.putLong("tag_value", ((java.lang.Long) obj).longValue());
                    } else if (obj instanceof java.lang.Double) {
                        bundle2.putDouble("tag_value", ((java.lang.Double) obj).doubleValue());
                    } else if (obj instanceof java.lang.Float) {
                        bundle2.putFloat("tag_value", ((java.lang.Float) obj).floatValue());
                    } else if (obj instanceof java.lang.String) {
                        bundle2.putString("tag_value", (java.lang.String) obj);
                    } else {
                        if (!(obj instanceof android.os.Parcelable)) {
                            throw new defpackage.aat("Unsupported primitive type: ".concat(java.lang.String.valueOf(obj.getClass().getName())), aasVarB);
                        }
                        bundle2.putParcelable("tag_value", (android.os.Parcelable) obj);
                    }
                    bundle = bundle2;
                } else if (obj instanceof android.os.IInterface) {
                    android.os.IInterface iInterface = (android.os.IInterface) obj;
                    bundle = new android.os.Bundle(3);
                    java.lang.String name = iInterface.getClass().getName();
                    bundle.putInt("tag_class_type", 1);
                    bundle.putBinder("tag_value", iInterface.asBinder());
                    bundle.putString("tag_class_name", name);
                } else if (obj instanceof android.os.IBinder) {
                    bundle = new android.os.Bundle(2);
                    bundle.putInt("tag_class_type", 9);
                    bundle.putBinder("tag_value", (android.os.IBinder) obj);
                } else if (obj instanceof java.util.Map) {
                    bundle = new android.os.Bundle(2);
                    java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
                    for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                        android.os.Bundle bundle3 = new android.os.Bundle(2);
                        bundle3.putBundle("tag_1", a(entry.getKey(), a.bw((byte) 62, i, "<key "), aasVarB));
                        if (entry.getValue() != null) {
                            bundle3.putBundle("tag_2", a(entry.getValue(), a.bw((byte) 62, i, "<value "), aasVarB));
                        }
                        i++;
                        arrayList.add(bundle3);
                    }
                    bundle.putInt("tag_class_type", 2);
                    bundle.putParcelableArrayList("tag_value", arrayList);
                } else if (obj instanceof java.util.List) {
                    bundle = f((java.util.List) obj, aasVarB);
                    bundle.putInt("tag_class_type", 4);
                } else if (obj instanceof java.util.Set) {
                    bundle = f((java.util.Set) obj, aasVarB);
                    bundle.putInt("tag_class_type", 3);
                } else if (obj.getClass().isEnum()) {
                    bundle = g(obj, aasVarB);
                } else if (obj instanceof java.lang.Class) {
                    bundle = new android.os.Bundle(2);
                    bundle.putInt("tag_class_type", 8);
                    bundle.putString("tag_value", ((java.lang.Class) obj).getName());
                } else {
                    if (obj.getClass().isArray()) {
                        throw new defpackage.aat("Object serializing contains an array, use a list or a set instead", aasVarB);
                    }
                    if (obj instanceof defpackage.dvv) {
                        defpackage.dvv dvvVar = (defpackage.dvv) obj;
                        bundle = new android.os.Bundle();
                        bundle.putCharSequence("name", dvvVar.a);
                        androidx.core.graphics.drawable.IconCompat iconCompat = dvvVar.b;
                        bundle.putBundle("icon", iconCompat != null ? iconCompat.d() : null);
                        bundle.putString("uri", dvvVar.c);
                        bundle.putString("key", dvvVar.d);
                        bundle.putBoolean("isBot", dvvVar.e);
                        bundle.putBoolean("isImportant", dvvVar.f);
                        bundle.putInt("tag_class_type", 10);
                    } else {
                        java.lang.String name2 = obj.getClass().getName();
                        if (!obj.getClass().isAnnotationPresent(defpackage.ug.class)) {
                            throw new defpackage.aat("Invalid class not marked as CarProtocol: ".concat(java.lang.String.valueOf(name2)), aasVarB);
                        }
                        try {
                            obj.getClass().getDeclaredConstructor(null);
                            java.util.List<java.lang.reflect.Field> listM = m(obj.getClass());
                            android.os.Bundle bundle4 = new android.os.Bundle(listM.size() + 2);
                            bundle4.putInt("tag_class_type", 5);
                            bundle4.putString("tag_class_name", name2);
                            for (java.lang.reflect.Field field : listM) {
                                field.setAccessible(true);
                                java.lang.String strD = d(field);
                                try {
                                    java.lang.Object obj2 = field.get(obj);
                                    if (obj2 != null) {
                                        bundle4.putParcelable(strD, a(obj2, field.getName(), aasVarB));
                                    }
                                } catch (java.lang.IllegalAccessException e) {
                                    throw new defpackage.aat("Field is not accessible: ".concat(strD), aasVarB, e);
                                }
                            }
                            bundle = bundle4;
                        } catch (java.lang.NoSuchMethodException e2) {
                            throw new defpackage.aat("Class to deserialize is missing a no args constructor: ".concat(java.lang.String.valueOf(name2)), aasVarB, e2);
                        }
                    }
                }
            }
            aasVarB.close();
            return bundle;
        } catch (java.lang.Throwable th) {
            try {
                aasVarB.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.HashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.Collection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public static java.lang.Object b(android.os.Bundle bundle, defpackage.aas aasVar) {
        ?? map;
        ?? J;
        bundle.setClassLoader((java.lang.ClassLoader) j$.util.Objects.requireNonNull(defpackage.aau.class.getClassLoader()));
        int i = bundle.getInt("tag_class_type");
        defpackage.aas aasVarB = defpackage.aas.b(bundle, c(bundle.getInt("tag_class_type")), aasVar);
        try {
            switch (i) {
                case 0:
                    java.lang.Object obj = bundle.get("tag_value");
                    J = obj;
                    if (obj == null) {
                        throw new defpackage.aat("Bundle is missing the primitive value", aasVarB);
                    }
                    J = iconCompatE;
                    aasVarB.close();
                    return J;
                case 1:
                    J = j(bundle, aasVarB);
                    J = iconCompatE;
                    aasVarB.close();
                    return J;
                case 2:
                    java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
                    if (parcelableArrayList == null) {
                        throw new defpackage.aat("Bundle is missing the map", aasVarB);
                    }
                    map = new java.util.HashMap();
                    int size = parcelableArrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        android.os.Bundle bundle2 = (android.os.Bundle) ((android.os.Parcelable) parcelableArrayList.get(i2));
                        android.os.Bundle bundle3 = bundle2.getBundle("tag_1");
                        android.os.Bundle bundle4 = bundle2.getBundle("tag_2");
                        if (bundle3 == null) {
                            throw new defpackage.aat("Bundle is missing key", aasVarB);
                        }
                        map.put(b(bundle3, aasVarB), bundle4 == null ? null : b(bundle4, aasVarB));
                    }
                    J = map;
                    J = iconCompatE;
                    aasVarB.close();
                    return J;
                case 3:
                    map = new java.util.HashSet();
                    n(bundle, map, aasVarB);
                    J = map;
                    J = iconCompatE;
                    aasVarB.close();
                    return J;
                case 4:
                    map = new java.util.ArrayList();
                    n(bundle, map, aasVarB);
                    J = map;
                    J = iconCompatE;
                    aasVarB.close();
                    return J;
                case 5:
                    J = k(bundle, aasVarB);
                    J = iconCompatE;
                    aasVarB.close();
                    return J;
                case 6:
                    android.os.Bundle bundle5 = bundle.getBundle("tag_value");
                    if (bundle5 == null) {
                        throw new defpackage.aat("IconCompat bundle is null", aasVarB);
                    }
                    androidx.core.graphics.drawable.IconCompat iconCompatE = androidx.core.graphics.drawable.IconCompat.e(bundle5);
                    if (iconCompatE == null) {
                        J = iconCompatE;
                        throw new defpackage.aat("Failed to create IconCompat from bundle", aasVarB);
                    }
                    J = iconCompatE;
                    aasVarB.close();
                    return J;
                case 7:
                    J = i(bundle, aasVarB);
                    J = iconCompatE;
                    aasVarB.close();
                    return J;
                case 8:
                    java.lang.String string = bundle.getString("tag_value");
                    if (string == null) {
                        throw new defpackage.aat("Class is missing the class name", aasVarB);
                    }
                    try {
                        J = h(string);
                        J = iconCompatE;
                        aasVarB.close();
                        return J;
                    } catch (java.lang.ClassNotFoundException e) {
                        throw new defpackage.aat("Class name is unknown: ".concat(string), aasVarB, e);
                    }
                case 9:
                    android.os.IBinder binder = bundle.getBinder("tag_value");
                    J = binder;
                    if (binder == null) {
                        throw new defpackage.aat("Bundle is missing the binder", aasVarB);
                    }
                    J = iconCompatE;
                    aasVarB.close();
                    return J;
                case 10:
                    J = defpackage.dvv.a(bundle);
                    J = iconCompatE;
                    aasVarB.close();
                    return J;
                default:
                    throw new defpackage.aat(a.bj(i, "Unsupported class type in bundle: "), aasVarB);
            }
        } catch (java.lang.Throwable th) {
            try {
                aasVarB.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static java.lang.String c(int i) {
        java.lang.String str = (java.lang.String) c.get(java.lang.Integer.valueOf(i));
        return str == null ? "unknown" : str;
    }

    static java.lang.String d(java.lang.reflect.Field field) {
        return java.lang.String.valueOf(field.getDeclaringClass().getName()).concat(java.lang.String.valueOf(field.getName()));
    }

    public static java.lang.String e(java.lang.Class cls) {
        java.lang.String str = (java.lang.String) b.get(cls);
        if (str != null) {
            return str;
        }
        if (java.util.List.class.isAssignableFrom(cls)) {
            return "<List>";
        }
        if (java.util.Map.class.isAssignableFrom(cls)) {
            return "<Map>";
        }
        return java.util.Set.class.isAssignableFrom(cls) ? "<Set>" : cls.getSimpleName();
    }

    private static android.os.Bundle f(java.util.Collection collection, defpackage.aas aasVar) {
        android.os.Bundle bundle = new android.os.Bundle(2);
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        java.util.Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(a(it.next(), a.bw((byte) 62, i, "<item "), aasVar));
            i++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    private static android.os.Bundle g(java.lang.Object obj, defpackage.aas aasVar) throws defpackage.aat {
        android.os.Bundle bundle = new android.os.Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (java.lang.String) l(obj.getClass(), "name", aasVar).invoke(obj, null));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (java.lang.ReflectiveOperationException e) {
            throw new defpackage.aat("Enum missing name method", aasVar, e);
        }
    }

    private static java.lang.Class h(java.lang.String str) {
        java.lang.Class<?> cls;
        java.util.Map map = d;
        synchronized (map) {
            cls = (java.lang.Class) map.get(str);
            if (cls == null) {
                cls = java.lang.Class.forName(str, false, defpackage.aau.class.getClassLoader());
                map.put(str, cls);
            }
        }
        return cls;
    }

    private static java.lang.Object i(android.os.Bundle bundle, defpackage.aas aasVar) throws defpackage.aat {
        java.lang.String string = bundle.getString("tag_value");
        if (string == null) {
            throw new defpackage.aat("Missing enum name [null]", aasVar);
        }
        java.lang.String string2 = bundle.getString("tag_class_name");
        if (string2 == null) {
            throw new defpackage.aat("Missing enum className [null]", aasVar);
        }
        try {
            java.lang.Class clsH = h(string2);
            if (clsH.isEnum()) {
                return l(clsH, "valueOf", aasVar).invoke(null, string);
            }
            throw new defpackage.aat(a.bk(string2, "Class ", " is not an enum"), aasVar);
        } catch (java.lang.ClassNotFoundException e) {
            throw new defpackage.aat(a.bk(string2, "Enum class [", "] not found"), aasVar, e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new defpackage.aat("Enum value [" + string + "] does not exist in enum class [" + string2 + ']', aasVar, e2);
        } catch (java.lang.ReflectiveOperationException e3) {
            throw new defpackage.aat(a.bk(string2, "Enum of class [", "] missing valueOf method"), aasVar, e3);
        }
    }

    private static java.lang.Object j(android.os.Bundle bundle, defpackage.aas aasVar) throws defpackage.aat {
        android.os.IBinder binder = bundle.getBinder("tag_value");
        if (binder == null) {
            throw new defpackage.aat("Bundle is missing the binder", aasVar);
        }
        java.lang.String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new defpackage.aat("Bundle is missing IInterface class name", aasVar);
        }
        try {
            java.lang.Class clsH = h(string);
            if (!android.os.IInterface.class.isAssignableFrom(clsH)) {
                throw new defpackage.aat(a.bk(string, "Interface class ", " does not implement IInterface"), aasVar);
            }
            java.lang.Object objInvoke = l(clsH, "asInterface", aasVar).invoke(null, binder);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new defpackage.aat("Failed to get interface from binder", aasVar);
        } catch (java.lang.ClassNotFoundException e) {
            throw new defpackage.aat("Binder for unknown IInterface: ".concat(string), aasVar, e);
        } catch (java.lang.ReflectiveOperationException e2) {
            throw new defpackage.aat("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), aasVar, e2);
        }
    }

    private static java.lang.Object k(android.os.Bundle bundle, defpackage.aas aasVar) throws defpackage.aat {
        java.lang.String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new defpackage.aat("Bundle is missing the class name", aasVar);
        }
        try {
            java.lang.Class clsH = h(string);
            if (!clsH.isAnnotationPresent(defpackage.ug.class)) {
                throw new defpackage.aat(a.bx(string, "Invalid class not marked as CarProtocol: "), aasVar);
            }
            java.lang.reflect.Constructor declaredConstructor = clsH.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
            for (java.lang.reflect.Field field : m(clsH)) {
                field.setAccessible(true);
                java.lang.String strD = d(field);
                java.lang.Object obj = bundle.get(strD);
                if (obj == null) {
                    obj = bundle.get(strD.replaceAll("androidx.core.graphics.drawable.IconCompat", "androidx.core.graphics.drawable.IconCompat"));
                }
                if (obj instanceof android.os.Bundle) {
                    field.set(objNewInstance, b((android.os.Bundle) obj, aasVar));
                } else if (obj == null && android.util.Log.isLoggable("CarApp.Bun", 3)) {
                    android.util.Log.d("CarApp.Bun", a.bh(field, "Value is null for field: "));
                }
            }
            return objNewInstance;
        } catch (java.lang.ClassNotFoundException e) {
            throw new defpackage.aat("Object for unknown class: ".concat(string), aasVar, e);
        } catch (java.lang.IllegalArgumentException e2) {
            throw new defpackage.aat("Failed to deserialize class: ".concat(string), aasVar, e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new defpackage.aat("Object missing no args constructor: ".concat(string), aasVar, e3);
        } catch (java.lang.ReflectiveOperationException e4) {
            throw new defpackage.aat("Constructor or field is not accessible: ".concat(string), aasVar, e4);
        }
    }

    private static java.lang.reflect.Method l(java.lang.Class cls, java.lang.String str, defpackage.aas aasVar) throws defpackage.aat {
        if (cls == null || cls == java.lang.Object.class) {
            throw new defpackage.aat(a.bo(cls, str, "No method ", " in class "), aasVar);
        }
        for (java.lang.reflect.Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return l(cls.getSuperclass(), str, aasVar);
    }

    private static java.util.List m(java.lang.Class cls) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (cls != null && cls != java.lang.Object.class) {
            for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            arrayList.addAll(m(cls.getSuperclass()));
        }
        return arrayList;
    }

    private static void n(android.os.Bundle bundle, java.util.Collection collection, defpackage.aas aasVar) throws defpackage.aat {
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new defpackage.aat("Bundle is missing the collection", aasVar);
        }
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            collection.add(b((android.os.Bundle) ((android.os.Parcelable) parcelableArrayList.get(i)), aasVar));
        }
    }
}
