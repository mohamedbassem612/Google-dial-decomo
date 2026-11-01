package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vkd implements defpackage.vjd {
    private final /* synthetic */ int $cid;

    public vkd(int i) {
        this.$cid = i;
    }

    @Override // defpackage.vjd
    public final int a() {
        if (this.$cid != 0) {
            return 7;
        }
        throw new java.lang.UnsupportedOperationException("Not supported on standard omtp");
    }

    @Override // defpackage.vjd
    public final j$.util.Optional b(java.lang.String str) {
        if (this.$cid != 0) {
            aooh.f(str, "languageCode");
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            aooh.e(optionalEmpty, "empty(...)");
            return optionalEmpty;
        }
        aooh.f(str, "languageCode");
        j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
        aooh.e(optionalEmpty2, "empty(...)");
        return optionalEmpty2;
    }

    @Override // defpackage.vjd
    public final j$.util.Optional c() {
        if (this.$cid != 0) {
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            aooh.e(optionalEmpty, "empty(...)");
            return optionalEmpty;
        }
        j$.util.Optional optionalOf = j$.util.Optional.of("XCLOSE_NUT");
        aooh.e(optionalOf, "of(...)");
        return optionalOf;
    }

    @Override // defpackage.vjd
    public final j$.util.Optional d(defpackage.vgm vgmVar) {
        if (this.$cid == 0) {
            aooh.f(vgmVar, "vvmStatusSms");
            throw new java.lang.UnsupportedOperationException("Not supported on standard omtp");
        }
        aooh.f(vgmVar, "vvmStatusSms");
        j$.util.Optional optionalOf = j$.util.Optional.of(vgmVar.k);
        aooh.e(optionalOf, "of(...)");
        return optionalOf;
    }

    @Override // defpackage.vjd
    public final j$.util.Optional e() {
        if (this.$cid != 0) {
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            aooh.e(optionalEmpty, "empty(...)");
            return optionalEmpty;
        }
        j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
        aooh.e(optionalEmpty2, "empty(...)");
        return optionalEmpty2;
    }

    @Override // defpackage.vjd
    public final java.lang.String f() {
        return "XCHANGE_TUI_PWD PWD=%1$s OLD_PWD=%2$s";
    }

    @Override // defpackage.vjd
    public final java.lang.String g() {
        return "XCHANGE_VM_LANG LANG=%1$s";
    }
}
