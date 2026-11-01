package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aewz {
    public final java.lang.String a;
    public final boolean b;
    public final boolean c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    public aewz(android.content.Context context, java.lang.String str, defpackage.giq giqVar, boolean z, boolean z2) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        this.d = context;
        this.a = str;
        this.e = giqVar;
        this.b = z;
        this.c = z2;
    }

    public final defpackage.aewz a() {
        java.lang.Object obj = this.d;
        if (obj == null) {
            android.util.Log.w("PhenotypeFlag", "Setting enableAutoSubpackage on SharedPrefs-backed flags");
        }
        return new defpackage.aewz((android.net.Uri) obj, (java.lang.String) this.e, this.a, this.b, true);
    }

    public final defpackage.aewz b() {
        java.lang.String str = (java.lang.String) this.e;
        if (!str.isEmpty()) {
            throw new java.lang.IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new defpackage.aewz((android.net.Uri) this.d, str, this.a, true, this.c);
    }

    public final defpackage.aexb c(java.lang.String str, long j) {
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        int i = defpackage.aexb.d;
        return new defpackage.aewt(this, str, lValueOf);
    }

    public final defpackage.aexb d(java.lang.String str, boolean z) {
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
        int i = defpackage.aexb.d;
        return new defpackage.aewu(this, str, boolValueOf);
    }

    public final defpackage.aexb e(java.lang.String str, defpackage.aewy aewyVar, java.lang.String str2) {
        int i = defpackage.aexb.d;
        return new defpackage.aewx(this, str, str2, aewyVar);
    }

    public aewz(android.net.Uri uri, java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        this.d = uri;
        this.e = str;
        this.a = str2;
        this.b = z;
        this.c = z2;
    }
}
