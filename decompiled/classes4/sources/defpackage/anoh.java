package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anoh {
    public static final defpackage.anoh a = new defpackage.anoh(null, anqw.b, false, null, null);
    public final defpackage.anok b;
    public final anqw c;
    public final boolean d;
    public final java.lang.String e;
    public final java.lang.String f;
    private final anty g = null;

    private anoh(defpackage.anok anokVar, anqw anqwVar, boolean z, java.lang.String str, java.lang.String str2) {
        this.b = anokVar;
        ahvr.cj(anqwVar, "status");
        this.c = anqwVar;
        this.d = z;
        this.e = str;
        this.f = str2;
    }

    public static defpackage.anoh a(anqw anqwVar) {
        ahvr.bN(!anqwVar.h(), "drop status shouldn't be OK");
        return new defpackage.anoh(null, anqwVar, true, null, null);
    }

    public static defpackage.anoh b(anqw anqwVar) {
        ahvr.bN(!anqwVar.h(), "error status shouldn't be OK");
        return new defpackage.anoh(null, anqwVar, false, null, null);
    }

    public static defpackage.anoh d(java.lang.String str) {
        return new defpackage.anoh(null, anqw.b, false, "connecting", str);
    }

    public static defpackage.anoh e(defpackage.anok anokVar) {
        return new defpackage.anoh(anokVar, anqw.b, false, null, null);
    }

    public final boolean c() {
        return (this.b == null && this.c.h()) ? false : true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.anoh)) {
            return false;
        }
        defpackage.anoh anohVar = (defpackage.anoh) obj;
        if (!j$.util.Objects.equals(this.b, anohVar.b) || !j$.util.Objects.equals(this.c, anohVar.c)) {
            return false;
        }
        anty antyVar = anohVar.g;
        return j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && this.d == anohVar.d;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.b, this.c, null, java.lang.Boolean.valueOf(this.d)});
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("subchannel", this.b);
        ahymVarL.b("streamTracerFactory", (java.lang.Object) null);
        ahymVarL.b("status", this.c);
        ahymVarL.g("drop", this.d);
        ahymVarL.b("authority-override", (java.lang.Object) null);
        return ahymVarL.toString();
    }
}
