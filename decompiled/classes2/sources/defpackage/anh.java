package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class anh extends dca {
    private final kaw a;

    public anh(kaw kawVar) {
        this.a = kawVar;
    }

    public final /* synthetic */ cmv d() {
        return new ani(this.a, 1, (aonj) null);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        ((ani) cmvVar).d(this.a);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.anh) && aooh.n(this.a, ((defpackage.anh) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        kaw kawVar = this.a;
        if (kawVar != null) {
            return kawVar.hashCode();
        }
        return 0;
    }
}
