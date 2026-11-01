package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class qu extends defpackage.rm {
    final int[] a;
    private java.lang.Integer b;

    static {
        defpackage.pi piVar = new defpackage.pi("VisibilityPermissionType");
        defpackage.pl plVar = new defpackage.pl("allRequiredPermissions");
        plVar.b(1);
        piVar.c(plVar.a());
        piVar.a();
    }

    public qu(java.util.Set set) {
        java.util.Set set2 = (java.util.Set) j$.util.Objects.requireNonNull(set);
        int[] iArr = new int[set2.size()];
        java.util.Iterator it = set2.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((java.lang.Integer) it.next()).intValue();
            i++;
        }
        this.a = iArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qu) {
            return java.util.Arrays.equals(this.a, ((defpackage.qu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Integer numValueOf = this.b;
        if (numValueOf == null) {
            numValueOf = java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.a));
            this.b = numValueOf;
        }
        return numValueOf.intValue();
    }
}
