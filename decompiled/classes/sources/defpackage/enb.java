package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class enb {
    public static final defpackage.enb a = new defpackage.enb();
    private static final java.util.Map c = new java.util.HashMap();
    public static final java.util.Map b = new java.util.HashMap();

    public static final emm b(java.lang.reflect.Constructor constructor, java.lang.Object obj) {
        try {
            java.lang.Object objNewInstance = constructor.newInstance(obj);
            defpackage.aooh.c(objNewInstance);
            return (emm) objNewInstance;
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    private static final boolean c(java.lang.Class cls) {
        return cls != null && defpackage.emw.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:63:0x010f A[PHI: r0
      0x010f: PHI (r0v6 java.util.ArrayList) = (r0v5 java.util.ArrayList), (r0v12 java.util.ArrayList) binds: [B:54:0x00f0, B:62:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x011b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0125  */
    /* JADX WARN: Code duplicated, block: B:71:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0130  */
    /* JADX WARN: Code duplicated, block: B:75:0x013d  */
    /* JADX WARN: Code duplicated, block: B:79:0x014a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x010f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final int a(java.lang.Class cls) {
        java.lang.reflect.Constructor declaredConstructor;
        java.lang.Class superclass;
        java.lang.Class<?>[] interfaces;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Integer num = (java.lang.Integer) c.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            java.util.ArrayList arrayList = null;
            try {
                java.lang.Package r3 = cls.getPackage();
                java.lang.String canonicalName = cls.getCanonicalName();
                java.lang.String name = r3 != null ? r3.getName() : "";
                if (name == null) {
                    defpackage.aooh.g();
                }
                if (name.length() != 0) {
                    if (canonicalName == null) {
                        defpackage.aooh.g();
                    }
                    canonicalName = canonicalName.substring(name.length() + 1);
                    defpackage.aooh.e(canonicalName, "substring(...)");
                }
                if (canonicalName == null) {
                    defpackage.aooh.g();
                }
                if (canonicalName == null) {
                    defpackage.aooh.i("className");
                }
                java.lang.String strConcat = java.lang.String.valueOf(defpackage.aoov.Q(canonicalName, ".", "_")).concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                java.lang.Class<?> cls2 = java.lang.Class.forName(strConcat);
                if (cls2 == 0) {
                    defpackage.aooh.h("null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
                }
                declaredConstructor = cls2.getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (java.lang.ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (java.lang.NoSuchMethodException e) {
                throw new java.lang.RuntimeException(e);
            }
            if (declaredConstructor != null) {
                java.util.Map map = b;
                java.util.List listSingletonList = java.util.Collections.singletonList(declaredConstructor);
                defpackage.aooh.e(listSingletonList, "singletonList(...)");
                map.put(cls, listSingletonList);
            } else {
                emi emiVar = emi.a;
                java.util.Map map2 = emiVar.b;
                java.lang.Boolean bool = (java.lang.Boolean) map2.get(cls);
                if (bool == null) {
                    java.lang.reflect.Method[] methodArrC = emiVar.c(cls);
                    for (java.lang.reflect.Method method : methodArrC) {
                        if (method.getAnnotation(androidx.lifecycle.OnLifecycleEvent.class) != null) {
                            emiVar.a(cls, methodArrC);
                        }
                    }
                    map2.put(cls, java.lang.Boolean.FALSE);
                    superclass = cls.getSuperclass();
                    if (c(superclass)) {
                        if (superclass == null) {
                            defpackage.aooh.g();
                        }
                        if (a(superclass) != 1) {
                            obj2 = b.get(superclass);
                            if (obj2 == null) {
                                defpackage.aooh.g();
                            }
                            arrayList = new java.util.ArrayList((java.util.Collection) obj2);
                            interfaces = cls.getInterfaces();
                            defpackage.aooh.e(interfaces, "getInterfaces(...)");
                            for (java.lang.Class<?> cls3 : interfaces) {
                                if (!c(cls3)) {
                                    if (cls3 == null) {
                                        defpackage.aooh.g();
                                    }
                                    if (a(cls3) != 1) {
                                        if (arrayList == null) {
                                            arrayList = new java.util.ArrayList();
                                        }
                                        obj = b.get(cls3);
                                        if (obj == null) {
                                            defpackage.aooh.g();
                                        }
                                        arrayList.addAll((java.util.Collection) obj);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                b.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        defpackage.aooh.e(interfaces, "getInterfaces(...)");
                        while (i < r5) {
                            if (!c(cls3)) {
                                if (cls3 == null) {
                                    defpackage.aooh.g();
                                }
                                if (a(cls3) != 1) {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    obj = b.get(cls3);
                                    if (obj == null) {
                                        defpackage.aooh.g();
                                    }
                                    arrayList.addAll((java.util.Collection) obj);
                                }
                            }
                        }
                        if (arrayList != null) {
                            b.put(cls, arrayList);
                        }
                    }
                } else if (!bool.booleanValue()) {
                    superclass = cls.getSuperclass();
                    if (c(superclass)) {
                        interfaces = cls.getInterfaces();
                        defpackage.aooh.e(interfaces, "getInterfaces(...)");
                        while (i < r5) {
                            if (!c(cls3)) {
                                if (cls3 == null) {
                                    defpackage.aooh.g();
                                }
                                if (a(cls3) != 1) {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    obj = b.get(cls3);
                                    if (obj == null) {
                                        defpackage.aooh.g();
                                    }
                                    arrayList.addAll((java.util.Collection) obj);
                                }
                            }
                        }
                        if (arrayList != null) {
                            b.put(cls, arrayList);
                        }
                    } else {
                        if (superclass == null) {
                            defpackage.aooh.g();
                        }
                        if (a(superclass) != 1) {
                            obj2 = b.get(superclass);
                            if (obj2 == null) {
                                defpackage.aooh.g();
                            }
                            arrayList = new java.util.ArrayList((java.util.Collection) obj2);
                            interfaces = cls.getInterfaces();
                            defpackage.aooh.e(interfaces, "getInterfaces(...)");
                            while (i < r5) {
                                if (!c(cls3)) {
                                    if (cls3 == null) {
                                        defpackage.aooh.g();
                                    }
                                    if (a(cls3) != 1) {
                                        if (arrayList == null) {
                                            arrayList = new java.util.ArrayList();
                                        }
                                        obj = b.get(cls3);
                                        if (obj == null) {
                                            defpackage.aooh.g();
                                        }
                                        arrayList.addAll((java.util.Collection) obj);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                b.put(cls, arrayList);
                            }
                        }
                    }
                }
            }
            i = 2;
        }
        c.put(cls, java.lang.Integer.valueOf(i));
        return i;
    }
}
