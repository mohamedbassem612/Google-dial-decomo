package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vkm implements defpackage.vjd {
    private static final aimz a = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/Vvm3ProtocolSpecificImap");
    private static final java.lang.String b = new java.util.Locale("es").getLanguage();

    @Override // defpackage.vjd
    public final int a() {
        return 6;
    }

    @Override // defpackage.vjd
    public final j$.util.Optional b(java.lang.String str) {
        return j$.util.Optional.of(true != b.equals(str) ? "5" : "6");
    }

    @Override // defpackage.vjd
    public final j$.util.Optional c() {
        return j$.util.Optional.of("CLOSE_NUT");
    }

    @Override // defpackage.vjd
    public final j$.util.Optional d(defpackage.vgm vgmVar) {
        java.lang.String str = vgmVar.e;
        if (str.indexOf(64) == -1) {
            a.bI(a.c().m(aioa.b), "Invalid IMAP username", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/Vvm3ProtocolSpecificImap", "getDefaultPin", 'P', "Vvm3ProtocolSpecificImap.java", zct.a);
            return j$.util.Optional.empty();
        }
        java.lang.String strSubstring = str.substring(0, str.indexOf(64));
        if (strSubstring.length() >= 4) {
            return j$.util.Optional.of("1".concat(java.lang.String.valueOf(strSubstring.substring(strSubstring.length() - 4))));
        }
        a.bI(a.c().m(aioa.b), "unable to extract number from IMAP username", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/vvm3/Vvm3ProtocolSpecificImap", "getDefaultPin", 'Y', "Vvm3ProtocolSpecificImap.java", zct.a);
        return j$.util.Optional.empty();
    }

    @Override // defpackage.vjd
    public final j$.util.Optional e() {
        return j$.util.Optional.empty();
    }

    @Override // defpackage.vjd
    public final java.lang.String f() {
        return "CHANGE_TUI_PWD PWD=%1$s OLD_PWD=%2$s";
    }

    @Override // defpackage.vjd
    public final java.lang.String g() {
        return "CHANGE_VM_LANG Lang=%1$s";
    }
}
