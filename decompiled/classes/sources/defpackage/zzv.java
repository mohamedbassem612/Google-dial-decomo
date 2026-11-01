package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zzv {
    public static final defpackage.zzv a;
    public static final defpackage.zzv b;
    public static final defpackage.zzv c;
    public final defpackage.aihd d;

    static {
        defpackage.aihd aihdVarA;
        java.util.EnumSet enumSetAllOf = java.util.EnumSet.allOf(defpackage.zzw.class);
        if (enumSetAllOf instanceof java.util.Collection) {
            aihdVarA = enumSetAllOf.isEmpty() ? defpackage.aikn.a : defpackage.aifs.a(java.util.EnumSet.copyOf((java.util.Collection) enumSetAllOf));
        } else {
            java.util.Iterator it = enumSetAllOf.iterator();
            if (it.hasNext()) {
                java.util.EnumSet enumSetOf = java.util.EnumSet.of((java.lang.Enum) it.next());
                defpackage.ahvr.bd(enumSetOf, it);
                aihdVarA = defpackage.aifs.a(enumSetOf);
            } else {
                aihdVarA = defpackage.aikn.a;
            }
        }
        a = new defpackage.zzv(aihdVarA);
        b = new defpackage.zzv(defpackage.aikn.a);
        c = new defpackage.zzv(defpackage.aifs.a(java.util.EnumSet.of(defpackage.zzw.ZWIEBACK, new defpackage.zzw[0])));
    }

    public zzv(defpackage.aihd aihdVar) {
        this.d = aihdVar;
    }

    public final boolean a(defpackage.zzw zzwVar) {
        return this.d.contains(zzwVar);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.zzv) && this.d.equals(((defpackage.zzv) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
