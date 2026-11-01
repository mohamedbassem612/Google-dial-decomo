package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahku {
    public final java.lang.String a;
    public final defpackage.ahyn b;
    public final java.lang.Boolean c;
    public final defpackage.ahyn d;
    public final defpackage.aify e;
    public final defpackage.ahkq f;
    public final defpackage.ahkk g;
    public final defpackage.aify h;

    public ahku(java.lang.String str, defpackage.ahyn ahynVar, java.lang.Boolean bool, defpackage.ahyn ahynVar2, defpackage.aify aifyVar, defpackage.ahkq ahkqVar, defpackage.ahkk ahkkVar, defpackage.aify aifyVar2) {
        this.a = str;
        this.b = ahynVar;
        this.c = bool;
        this.d = ahynVar2;
        this.e = aifyVar;
        this.f = ahkqVar;
        this.g = ahkkVar;
        this.h = aifyVar2;
    }

    public static defpackage.ahkt a() {
        defpackage.ahkt ahktVar = new defpackage.ahkt();
        ahktVar.b = java.lang.Boolean.FALSE;
        ahktVar.e = new defpackage.ahkk(1, 2);
        ahktVar.d = new defpackage.ahkp(1);
        return ahktVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahku) {
            defpackage.ahku ahkuVar = (defpackage.ahku) obj;
            if (this.a.equals(ahkuVar.a) && this.b.equals(ahkuVar.b) && this.c.equals(ahkuVar.c) && this.d.equals(ahkuVar.d) && defpackage.ahvr.aP(this.e, ahkuVar.e) && this.f.equals(ahkuVar.f) && this.g.equals(ahkuVar.g) && defpackage.ahvr.aP(this.h, ahkuVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.aify aifyVar = this.h;
        defpackage.ahkk ahkkVar = this.g;
        defpackage.ahkq ahkqVar = this.f;
        defpackage.aify aifyVar2 = this.e;
        defpackage.ahyn ahynVar = this.d;
        return "RoomDatabaseDaosConfig{name=" + this.a + ", createFromAsset=" + java.lang.String.valueOf(this.b) + ", enableMultiInstanceInvalidation=" + this.c + ", journalMode=" + java.lang.String.valueOf(ahynVar) + ", migrations=" + java.lang.String.valueOf(aifyVar2) + ", fallbackMigrationStrategy=" + java.lang.String.valueOf(ahkqVar) + ", storage=" + java.lang.String.valueOf(ahkkVar) + ", callbacks=" + java.lang.String.valueOf(aifyVar) + '}';
    }

    public ahku() {
        throw null;
    }
}
