package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ j$.nio.file.b a(java.nio.file.AccessMode accessMode) {
        if (accessMode == null) {
            return null;
        }
        if (accessMode == java.nio.file.AccessMode.READ) {
            return j$.nio.file.b.READ;
        }
        return accessMode == java.nio.file.AccessMode.WRITE ? j$.nio.file.b.WRITE : j$.nio.file.b.EXECUTE;
    }

    public static j$.nio.file.i0 b(java.nio.file.WatchEvent.Kind kind) {
        if (kind == null) {
            return null;
        }
        if (kind == java.nio.file.StandardWatchEventKinds.ENTRY_CREATE) {
            return j$.nio.file.f0.b;
        }
        if (kind == java.nio.file.StandardWatchEventKinds.ENTRY_DELETE) {
            return j$.nio.file.f0.c;
        }
        if (kind == java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY) {
            return j$.nio.file.f0.d;
        }
        if (kind == java.nio.file.StandardWatchEventKinds.OVERFLOW) {
            return j$.nio.file.f0.a;
        }
        return kind instanceof j$.nio.file.h0 ? ((j$.nio.file.h0) kind).a : new j$.nio.file.g0(kind);
    }

    public static /* synthetic */ java.nio.file.LinkOption c(j$.nio.file.LinkOption linkOption) {
        if (linkOption == null) {
            return null;
        }
        return java.nio.file.LinkOption.NOFOLLOW_LINKS;
    }

    public static /* synthetic */ java.nio.file.StandardCopyOption d(j$.nio.file.StandardCopyOption standardCopyOption) {
        if (standardCopyOption == j$.nio.file.StandardCopyOption.REPLACE_EXISTING) {
            return java.nio.file.StandardCopyOption.REPLACE_EXISTING;
        }
        return standardCopyOption == j$.nio.file.StandardCopyOption.COPY_ATTRIBUTES ? java.nio.file.StandardCopyOption.COPY_ATTRIBUTES : java.nio.file.StandardCopyOption.ATOMIC_MOVE;
    }

    public static /* synthetic */ java.nio.file.StandardOpenOption e(j$.nio.file.StandardOpenOption standardOpenOption) {
        if (standardOpenOption == j$.nio.file.StandardOpenOption.READ) {
            return java.nio.file.StandardOpenOption.READ;
        }
        if (standardOpenOption == j$.nio.file.StandardOpenOption.WRITE) {
            return java.nio.file.StandardOpenOption.WRITE;
        }
        if (standardOpenOption == j$.nio.file.StandardOpenOption.APPEND) {
            return java.nio.file.StandardOpenOption.APPEND;
        }
        if (standardOpenOption == j$.nio.file.StandardOpenOption.TRUNCATE_EXISTING) {
            return java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
        }
        if (standardOpenOption == j$.nio.file.StandardOpenOption.CREATE) {
            return java.nio.file.StandardOpenOption.CREATE;
        }
        if (standardOpenOption == j$.nio.file.StandardOpenOption.CREATE_NEW) {
            return java.nio.file.StandardOpenOption.CREATE_NEW;
        }
        if (standardOpenOption == j$.nio.file.StandardOpenOption.DELETE_ON_CLOSE) {
            return java.nio.file.StandardOpenOption.DELETE_ON_CLOSE;
        }
        if (standardOpenOption == j$.nio.file.StandardOpenOption.SPARSE) {
            return java.nio.file.StandardOpenOption.SPARSE;
        }
        return standardOpenOption == j$.nio.file.StandardOpenOption.SYNC ? java.nio.file.StandardOpenOption.SYNC : java.nio.file.StandardOpenOption.DSYNC;
    }

    public static java.nio.file.WatchEvent.Kind f(j$.nio.file.i0 i0Var) {
        if (i0Var == null) {
            return null;
        }
        if (i0Var == j$.nio.file.f0.b) {
            return java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
        }
        if (i0Var == j$.nio.file.f0.c) {
            return java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
        }
        if (i0Var == j$.nio.file.f0.d) {
            return java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;
        }
        if (i0Var == j$.nio.file.f0.a) {
            return java.nio.file.StandardWatchEventKinds.OVERFLOW;
        }
        return i0Var instanceof j$.nio.file.g0 ? ((j$.nio.file.g0) i0Var).a : new j$.nio.file.h0(i0Var);
    }

    public static java.lang.Object g(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof j$.nio.file.Path) {
            return j$.nio.file.x.h((j$.nio.file.Path) obj);
        }
        return obj instanceof java.nio.file.Path ? j$.nio.file.w.h((java.nio.file.Path) obj) : obj;
    }

    public static java.lang.Class h(java.lang.Class cls) {
        if (cls == null) {
            return null;
        }
        java.lang.Class cls2 = java.nio.file.attribute.BasicFileAttributeView.class;
        java.lang.Class cls3 = j$.nio.file.attribute.g.class;
        if (cls != cls2) {
            if (cls != cls3) {
                cls2 = java.nio.file.attribute.PosixFileAttributeView.class;
                cls3 = j$.nio.file.attribute.j0.class;
                if (cls != cls2) {
                    if (cls != cls3) {
                        cls2 = java.nio.file.attribute.FileOwnerAttributeView.class;
                        cls3 = j$.nio.file.attribute.z.class;
                        if (cls != cls2) {
                            if (cls != cls3) {
                                cls2 = j$.nio.file.attribute.l.class;
                                if (cls == cls2) {
                                    return java.nio.file.attribute.DosFileAttributeView.class;
                                }
                                if (cls != java.nio.file.attribute.DosFileAttributeView.class) {
                                    cls2 = j$.nio.file.attribute.q0.class;
                                    if (cls == cls2) {
                                        return java.nio.file.attribute.UserDefinedFileAttributeView.class;
                                    }
                                    if (cls != java.nio.file.attribute.UserDefinedFileAttributeView.class) {
                                        cls2 = j$.nio.file.attribute.c.class;
                                        if (cls == cls2) {
                                            return java.nio.file.attribute.AclFileAttributeView.class;
                                        }
                                        if (cls != java.nio.file.attribute.AclFileAttributeView.class) {
                                            j$.util.f.a("java.nio.file.attribute.FileAttributeView", cls);
                                            throw null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return cls2;
        }
        return cls3;
    }

    public static java.lang.Class i(java.lang.Class cls) {
        if (cls == null) {
            return null;
        }
        java.lang.Class cls2 = java.nio.file.attribute.BasicFileAttributes.class;
        java.lang.Class cls3 = j$.nio.file.attribute.BasicFileAttributes.class;
        if (cls != cls2) {
            if (cls != cls3) {
                cls2 = java.nio.file.attribute.PosixFileAttributes.class;
                cls3 = j$.nio.file.attribute.m0.class;
                if (cls != cls2) {
                    if (cls != cls3) {
                        cls2 = j$.nio.file.attribute.o.class;
                        if (cls == cls2) {
                            return java.nio.file.attribute.DosFileAttributes.class;
                        }
                        if (cls != java.nio.file.attribute.DosFileAttributes.class) {
                            j$.util.f.a("java.nio.file.attribute.BasicFileAttributes", cls);
                            throw null;
                        }
                    }
                }
            }
            return cls2;
        }
        return cls3;
    }

    public static java.util.Map j(java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        java.util.HashMap map2 = new java.util.HashMap();
        for (java.lang.String str : map.keySet()) {
            map2.put(str, k(map.get(str)));
        }
        return map2;
    }

    public static java.lang.Object k(java.lang.Object obj) {
        if (obj instanceof java.nio.file.attribute.FileTime) {
            try {
                return j$.nio.file.attribute.t.b((java.nio.file.attribute.FileTime) obj);
            } catch (java.lang.ClassCastException e) {
                j$.util.f.a("java.nio.file.attribute.FileTime", e);
                throw null;
            }
        }
        if (!(obj instanceof j$.nio.file.attribute.FileTime)) {
            return obj;
        }
        try {
            return j$.nio.file.attribute.t.c((j$.nio.file.attribute.FileTime) obj);
        } catch (java.lang.ClassCastException e2) {
            j$.util.f.a("java.nio.file.attribute.FileTime", e2);
            throw null;
        }
    }

    public static java.util.Set l(java.util.Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.Object next = set.iterator().next();
        if (next instanceof j$.nio.file.OpenOption) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(j$.nio.file.u.a((j$.nio.file.OpenOption) it.next()));
                } catch (java.lang.ClassCastException e) {
                    j$.util.f.a("java.nio.file.OpenOption", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof java.nio.file.OpenOption)) {
                j$.util.f.a("java.nio.file.OpenOption", next.getClass());
                throw null;
            }
            java.util.Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    hashSet.add(j$.nio.file.t.a((java.nio.file.OpenOption) it2.next()));
                } catch (java.lang.ClassCastException e2) {
                    j$.util.f.a("java.nio.file.OpenOption", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static java.util.Set m(java.util.Set set) {
        j$.nio.file.attribute.n0 n0Var;
        java.nio.file.attribute.PosixFilePermission posixFilePermission;
        if (set == null || set.isEmpty()) {
            return set;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.Object next = set.iterator().next();
        if (next instanceof j$.nio.file.attribute.n0) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    j$.nio.file.attribute.n0 n0Var2 = (j$.nio.file.attribute.n0) it.next();
                    if (n0Var2 == null) {
                        posixFilePermission = null;
                    } else if (n0Var2 == j$.nio.file.attribute.n0.OWNER_READ) {
                        posixFilePermission = java.nio.file.attribute.PosixFilePermission.OWNER_READ;
                    } else if (n0Var2 == j$.nio.file.attribute.n0.OWNER_WRITE) {
                        posixFilePermission = java.nio.file.attribute.PosixFilePermission.OWNER_WRITE;
                    } else if (n0Var2 == j$.nio.file.attribute.n0.OWNER_EXECUTE) {
                        posixFilePermission = java.nio.file.attribute.PosixFilePermission.OWNER_EXECUTE;
                    } else if (n0Var2 == j$.nio.file.attribute.n0.GROUP_READ) {
                        posixFilePermission = java.nio.file.attribute.PosixFilePermission.GROUP_READ;
                    } else if (n0Var2 == j$.nio.file.attribute.n0.GROUP_WRITE) {
                        posixFilePermission = java.nio.file.attribute.PosixFilePermission.GROUP_WRITE;
                    } else if (n0Var2 == j$.nio.file.attribute.n0.GROUP_EXECUTE) {
                        posixFilePermission = java.nio.file.attribute.PosixFilePermission.GROUP_EXECUTE;
                    } else if (n0Var2 == j$.nio.file.attribute.n0.OTHERS_READ) {
                        posixFilePermission = java.nio.file.attribute.PosixFilePermission.OTHERS_READ;
                    } else {
                        posixFilePermission = n0Var2 == j$.nio.file.attribute.n0.OTHERS_WRITE ? java.nio.file.attribute.PosixFilePermission.OTHERS_WRITE : java.nio.file.attribute.PosixFilePermission.OTHERS_EXECUTE;
                    }
                    hashSet.add(posixFilePermission);
                } catch (java.lang.ClassCastException e) {
                    j$.util.f.a("java.nio.file.attribute.PosixFilePermission", e);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof java.nio.file.attribute.PosixFilePermission)) {
                j$.util.f.a("java.nio.file.attribute.PosixFilePermission", next.getClass());
                throw null;
            }
            java.util.Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    java.nio.file.attribute.PosixFilePermission posixFilePermission2 = (java.nio.file.attribute.PosixFilePermission) it2.next();
                    if (posixFilePermission2 == null) {
                        n0Var = null;
                    } else if (posixFilePermission2 == java.nio.file.attribute.PosixFilePermission.OWNER_READ) {
                        n0Var = j$.nio.file.attribute.n0.OWNER_READ;
                    } else if (posixFilePermission2 == java.nio.file.attribute.PosixFilePermission.OWNER_WRITE) {
                        n0Var = j$.nio.file.attribute.n0.OWNER_WRITE;
                    } else if (posixFilePermission2 == java.nio.file.attribute.PosixFilePermission.OWNER_EXECUTE) {
                        n0Var = j$.nio.file.attribute.n0.OWNER_EXECUTE;
                    } else if (posixFilePermission2 == java.nio.file.attribute.PosixFilePermission.GROUP_READ) {
                        n0Var = j$.nio.file.attribute.n0.GROUP_READ;
                    } else if (posixFilePermission2 == java.nio.file.attribute.PosixFilePermission.GROUP_WRITE) {
                        n0Var = j$.nio.file.attribute.n0.GROUP_WRITE;
                    } else if (posixFilePermission2 == java.nio.file.attribute.PosixFilePermission.GROUP_EXECUTE) {
                        n0Var = j$.nio.file.attribute.n0.GROUP_EXECUTE;
                    } else if (posixFilePermission2 == java.nio.file.attribute.PosixFilePermission.OTHERS_READ) {
                        n0Var = j$.nio.file.attribute.n0.OTHERS_READ;
                    } else {
                        n0Var = posixFilePermission2 == java.nio.file.attribute.PosixFilePermission.OTHERS_WRITE ? j$.nio.file.attribute.n0.OTHERS_WRITE : j$.nio.file.attribute.n0.OTHERS_EXECUTE;
                    }
                    hashSet.add(n0Var);
                } catch (java.lang.ClassCastException e2) {
                    j$.util.f.a("java.nio.file.attribute.PosixFilePermission", e2);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static java.util.List n(java.util.List list) {
        j$.nio.file.o0 m0Var;
        java.nio.file.WatchEvent n0Var;
        if (list == null || list.isEmpty()) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object obj = list.get(0);
        if (obj instanceof j$.nio.file.o0) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    j$.nio.file.o0 o0Var = (j$.nio.file.o0) it.next();
                    if (o0Var == null) {
                        n0Var = null;
                    } else {
                        n0Var = o0Var instanceof j$.nio.file.m0 ? ((j$.nio.file.m0) o0Var).a : new j$.nio.file.n0(o0Var);
                    }
                    arrayList.add(n0Var);
                } catch (java.lang.ClassCastException e) {
                    j$.util.f.a("java.nio.file.WatchEvent", e);
                    throw null;
                }
            }
        } else {
            if (!(obj instanceof java.nio.file.WatchEvent)) {
                j$.util.f.a("java.nio.file.WatchEvent", obj.getClass());
                throw null;
            }
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    java.nio.file.WatchEvent watchEvent = (java.nio.file.WatchEvent) it2.next();
                    if (watchEvent == null) {
                        m0Var = null;
                    } else {
                        m0Var = watchEvent instanceof j$.nio.file.n0 ? ((j$.nio.file.n0) watchEvent).a : new j$.nio.file.m0(watchEvent);
                    }
                    arrayList.add(m0Var);
                } catch (java.lang.ClassCastException e2) {
                    j$.util.f.a("java.nio.file.WatchEvent", e2);
                    throw null;
                }
            }
        }
        return arrayList;
    }
}
