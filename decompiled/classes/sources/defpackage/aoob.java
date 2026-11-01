package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoob {
    private static final java.lang.Object[] a = new java.lang.Object[0];

    public static final java.lang.Object[] a(java.util.Collection collection) {
        int size = collection.size();
        if (size == 0) {
            return a;
        }
        java.util.Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return a;
        }
        java.lang.Object[] objArrCopyOf = new java.lang.Object[size];
        int i = 0;
        while (true) {
            objArrCopyOf[i] = it.next();
            i++;
            if (i >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i2 = ((i * 3) + 1) >>> 1;
                if (i2 <= i) {
                    i2 = 2147483645;
                    if (i >= 2147483645) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i2);
                defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, i);
                defpackage.aooh.e(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final java.lang.Object[] b(java.util.Collection collection, java.lang.Object[] objArr) {
        java.lang.Object[] objArrCopyOf;
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            java.util.Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
                    defpackage.aooh.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (java.lang.Object[]) objNewInstance;
                }
                while (true) {
                    objArrCopyOf[i] = it.next();
                    i++;
                    if (i >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i2 = ((i * 3) + 1) >>> 1;
                        if (i2 <= i) {
                            i2 = 2147483645;
                            if (i >= 2147483645) {
                                throw new java.lang.OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i2);
                        defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, i);
                            defpackage.aooh.e(objArrCopyOf2, "copyOf(...)");
                            return objArrCopyOf2;
                        }
                        objArr[i] = null;
                    }
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
        }
        return objArr;
    }
}
