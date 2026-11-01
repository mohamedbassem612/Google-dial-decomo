package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kdf {
    public final j$.util.Optional a;
    public final tcp b;
    public final aigf c;
    public final j$.util.Optional d;
    public final boolean e;

    public kdf(j$.util.Optional optional, tcp tcpVar, aigf aigfVar, j$.util.Optional optional2, boolean z) {
        this.a = optional;
        this.b = tcpVar;
        this.c = aigfVar;
        this.d = optional2;
        this.e = z;
    }

    public static defpackage.kde a() {
        defpackage.kde kdeVar = new defpackage.kde();
        kdeVar.e(tcp.e);
        kdeVar.f(aikj.b);
        kdeVar.b(j$.util.Optional.empty());
        kdeVar.c(false);
        return kdeVar;
    }

    public final aify b() {
        return (aify) this.a.orElse(aike.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.kdf) {
            defpackage.kdf kdfVar = (defpackage.kdf) obj;
            if (this.a.equals(kdfVar.a) && this.b.equals(kdfVar.b) && this.c.equals(kdfVar.c) && this.d.equals(kdfVar.d) && this.e == kdfVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.d;
        aigf aigfVar = this.c;
        tcp tcpVar = this.b;
        return "CallLogUiModelRowsWithCallingOptions{optionalCallLogUiModelRows=" + java.lang.String.valueOf(this.a) + ", rttConfiguration=" + java.lang.String.valueOf(tcpVar) + ", wifiCallingIconsConfigForEachRowId=" + java.lang.String.valueOf(aigfVar) + ", filterState=" + java.lang.String.valueOf(optional) + ", initialLoad=" + this.e + '}';
    }

    public kdf() {
        throw null;
    }
}
