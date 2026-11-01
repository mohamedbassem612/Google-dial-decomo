package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class akyl implements defpackage.albg {
    private static void b(java.util.List list, int i) {
        java.lang.String str = "Element at index " + (list.size() - i) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new java.lang.NullPointerException(str);
            }
            list.remove(size);
        }
    }

    public static void i(java.lang.Iterable iterable, java.util.List list) {
        iterable.getClass();
        if (iterable instanceof defpackage.albc) {
            java.util.List listA = ((defpackage.albc) iterable).a();
            defpackage.albc albcVar = (defpackage.albc) list;
            int size = list.size();
            for (java.lang.Object obj : listA) {
                if (obj == null) {
                    java.lang.String str = "Element at index " + (albcVar.size() - size) + " is null.";
                    int size2 = albcVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new java.lang.NullPointerException(str);
                        }
                        albcVar.remove(size2);
                    }
                } else if (obj instanceof defpackage.akzc) {
                    albcVar.b();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    defpackage.akzc akzcVar = defpackage.akzc.d;
                    try {
                        defpackage.akzc.E(bArr, 0, length);
                        albcVar.b();
                    } catch (defpackage.alaz e) {
                        throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                    }
                } else {
                    albcVar.add((java.lang.String) obj);
                }
            }
            return;
        }
        if (iterable instanceof defpackage.albo) {
            list.addAll((java.util.Collection) iterable);
            return;
        }
        if (iterable instanceof java.util.Collection) {
            int size3 = ((java.util.Collection) iterable).size();
            if (list instanceof java.util.ArrayList) {
                ((java.util.ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof defpackage.albq) {
                defpackage.albq albqVar = (defpackage.albq) list;
                int size4 = list.size() + size3;
                int length2 = albqVar.b.length;
                if (size4 > length2) {
                    if (length2 == 0) {
                        albqVar.b = new java.lang.Object[java.lang.Math.max(size4, 10)];
                    } else {
                        while (length2 < size4) {
                            length2 = ((length2 * 3) / 2) + 1;
                        }
                        albqVar.b = java.util.Arrays.copyOf(albqVar.b, length2);
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof java.util.List) || !(iterable instanceof java.util.RandomAccess)) {
            for (java.lang.Object obj2 : iterable) {
                if (obj2 == null) {
                    b(list, size5);
                }
                list.add(obj2);
            }
            return;
        }
        java.util.List list2 = (java.util.List) iterable;
        int size6 = list2.size();
        for (int i = 0; i < size6; i++) {
            java.lang.Object obj3 = list2.get(i);
            if (obj3 == null) {
                b(list, size5);
            }
            list.add(obj3);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: a */
    public abstract defpackage.akyl clone();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.albg
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract defpackage.akyl f(defpackage.akym akymVar);

    @Override // defpackage.albg
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final defpackage.akyl h(byte[] bArr, defpackage.akzq akzqVar) {
        return m(bArr, bArr.length, akzqVar);
    }

    @Override // defpackage.albg
    public final /* bridge */ /* synthetic */ defpackage.albg g(byte[] bArr) {
        return l(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: j */
    public abstract void k(defpackage.akzf akzfVar, defpackage.akzq akzqVar);

    @Override // defpackage.albg
    public /* bridge */ /* synthetic */ void k(defpackage.akzf akzfVar, defpackage.akzq akzqVar) {
        throw null;
    }

    public defpackage.akyl l(byte[] bArr, int i) {
        throw null;
    }

    public defpackage.akyl m(byte[] bArr, int i, defpackage.akzq akzqVar) {
        throw null;
    }

    @Override // defpackage.albg
    public final /* bridge */ /* synthetic */ void n(defpackage.akzc akzcVar) throws defpackage.alaz {
        try {
            defpackage.akzf akzfVarG = akzcVar.g();
            k(akzfVarG, defpackage.akzq.a);
            akzfVarG.A(0);
        } catch (defpackage.alaz e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new java.lang.RuntimeException("Reading " + getClass().getName() + " from a ByteString threw an IOException (should never happen).", e2);
        }
    }
}
