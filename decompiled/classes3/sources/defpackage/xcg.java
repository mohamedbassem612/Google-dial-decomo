package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xcg extends defpackage.xcm {
    private final j$.util.OptionalInt a;
    private final j$.util.OptionalInt b;
    private final j$.util.OptionalInt c;

    public xcg(j$.util.OptionalInt optionalInt, j$.util.OptionalInt optionalInt2, j$.util.OptionalInt optionalInt3) {
        this.a = optionalInt;
        this.b = optionalInt2;
        this.c = optionalInt3;
    }

    @Override // defpackage.xcm
    public final j$.util.OptionalInt a() {
        return this.c;
    }

    @Override // defpackage.xcm
    public final j$.util.OptionalInt b() {
        return this.a;
    }

    @Override // defpackage.xcm
    public final j$.util.OptionalInt c() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.xcm) {
            defpackage.xcm xcmVar = (defpackage.xcm) obj;
            if (this.a.equals(xcmVar.b()) && this.b.equals(xcmVar.c()) && this.c.equals(xcmVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.OptionalInt optionalInt = this.c;
        j$.util.OptionalInt optionalInt2 = this.b;
        return "SystemConfigDiff{ringerMode=" + java.lang.String.valueOf(this.a) + ", ringerVolume=" + java.lang.String.valueOf(optionalInt2) + ", notificationInterruptionFilter=" + java.lang.String.valueOf(optionalInt) + '}';
    }
}
