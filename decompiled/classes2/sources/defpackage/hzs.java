package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hzs implements defpackage.hzj {
    private final /* synthetic */ int $cid;
    private final aoin a;

    public hzs(aoin aoinVar, int i) {
        this.$cid = i;
        aooh.f(aoinVar, "audioRecordWrapperProvider");
        this.a = aoinVar;
    }

    @Override // defpackage.hzj
    public final android.media.AudioFormat a() {
        int i = this.$cid;
        if (i == 0) {
            return defpackage.hzt.a;
        }
        if (i == 1) {
            return defpackage.hzr.a;
        }
        if (i == 2) {
            return defpackage.hzu.a;
        }
        if (i == 3) {
            return defpackage.hzw.a;
        }
        if (i != 4) {
            return i != 5 ? defpackage.iar.b : defpackage.iaa.a;
        }
        return defpackage.hzy.a;
    }

    @Override // defpackage.hzj
    public final defpackage.hzk b() {
        int i = this.$cid;
        if (i == 0) {
            return (defpackage.hzk) this.a.a();
        }
        if (i == 1) {
            return (defpackage.hzk) this.a.a();
        }
        if (i == 2) {
            return (defpackage.hzk) this.a.a();
        }
        if (i == 3) {
            return (defpackage.hzk) this.a.a();
        }
        if (i == 4) {
            return (defpackage.hzk) this.a.a();
        }
        aoin aoinVar = this.a;
        return i != 5 ? (defpackage.hzk) aoinVar.a() : (defpackage.hzk) aoinVar.a();
    }

    public hzs(aoin aoinVar, int i, byte[] bArr) {
        this.$cid = i;
        aooh.f(aoinVar, "audioRecordWrapperProvider");
        this.a = aoinVar;
    }

    public hzs(aoin aoinVar, int i, char[] cArr) {
        this.$cid = i;
        aooh.f(aoinVar, "audioRecordWrapperProvider");
        this.a = aoinVar;
    }

    public hzs(aoin aoinVar, int i, float[] fArr) {
        this.$cid = i;
        this.a = aoinVar;
    }
}
