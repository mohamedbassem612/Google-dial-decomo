package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anlw {
    public static final defpackage.anlw a;
    private static final java.util.IdentityHashMap c;
    public final java.util.IdentityHashMap b;

    static {
        java.util.IdentityHashMap identityHashMap = new java.util.IdentityHashMap();
        c = identityHashMap;
        a = new defpackage.anlw(identityHashMap);
    }

    public anlw(java.util.IdentityHashMap identityHashMap) {
        this.b = identityHashMap;
    }

    public final java.lang.Object a(anlv anlvVar) {
        return this.b.get(anlvVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            java.util.IdentityHashMap identityHashMap = this.b;
            java.util.IdentityHashMap identityHashMap2 = ((defpackage.anlw) obj).b;
            if (identityHashMap.size() == identityHashMap2.size()) {
                for (java.util.Map.Entry entry : identityHashMap.entrySet()) {
                    if (!identityHashMap2.containsKey(entry.getKey()) || !j$.util.Objects.equals(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHash = 0;
        for (java.util.Map.Entry entry : this.b.entrySet()) {
            iHash += j$.util.Objects.hash(new java.lang.Object[]{entry.getKey(), entry.getValue()});
        }
        return iHash;
    }

    public final java.lang.String toString() {
        return this.b.toString();
    }
}
