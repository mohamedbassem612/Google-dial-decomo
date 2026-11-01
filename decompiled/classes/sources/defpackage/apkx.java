package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apkx implements defpackage.apkz {
    public final defpackage.apkt a;

    public apkx(defpackage.apkt apktVar) {
        this.a = apktVar;
    }

    @Override // defpackage.apkz
    public final defpackage.apkt b() {
        return this.a;
    }

    @Override // defpackage.apkz
    public final /* bridge */ /* synthetic */ defpackage.apky c() {
        throw new java.lang.IllegalStateException("already connected");
    }

    @Override // defpackage.apkz
    public final /* bridge */ /* synthetic */ defpackage.apky d() {
        throw new java.lang.IllegalStateException("already connected");
    }

    @Override // defpackage.apkz
    public final /* bridge */ /* synthetic */ defpackage.apkz e() {
        throw new java.lang.IllegalStateException("unexpected retry");
    }

    @Override // defpackage.apkz, defpackage.aplo
    public final /* bridge */ /* synthetic */ void f() {
        throw new java.lang.IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.apkz
    public final boolean i() {
        return true;
    }
}
