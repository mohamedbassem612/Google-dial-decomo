package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apls extends defpackage.apjo {
    private final java.lang.String a;
    private final long b;
    private final defpackage.appa d;

    public apls(java.lang.String str, long j, defpackage.appa appaVar) {
        this.a = str;
        this.b = j;
        this.d = appaVar;
    }

    @Override // defpackage.apjo
    public final long a() {
        return this.b;
    }

    @Override // defpackage.apjo
    public final defpackage.appa c() {
        return this.d;
    }

    @Override // defpackage.apjo
    public final defpackage.apiy fO() {
        java.lang.String str = this.a;
        if (str == null) {
            return null;
        }
        defpackage.aorg aorgVar = defpackage.apiy.a;
        try {
            return defpackage.aooh.R(str);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }
}
