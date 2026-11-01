package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class puj implements defpackage.pug {
    private static final aimz a = aimz.i("com/android/dialer/incall/core/call/events/impl/PhoneAccountSelectionEventState");
    private final defpackage.ptw b;
    private final defpackage.pum c;
    private final defpackage.pud d;
    private final defpackage.pun e;

    public puj(defpackage.ptw ptwVar, defpackage.pud pudVar, defpackage.pun punVar, defpackage.pum pumVar) {
        this.b = ptwVar;
        this.d = pudVar;
        this.e = punVar;
        this.c = pumVar;
    }

    @Override // defpackage.pug
    public final j$.util.Optional a(defpackage.pty ptyVar) {
        defpackage.zpo zpoVar = ptyVar.a;
        int iOrdinal = zpoVar.ordinal();
        if (iOrdinal == 2) {
            return j$.util.Optional.of(this.d);
        }
        switch (iOrdinal) {
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return j$.util.Optional.of(this.e);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return j$.util.Optional.empty();
            default:
                a.bt(a.c().m(aioa.b), "Call going from SELECT_PHONE_ACCOUNT state to %s unexpectedly.", new akct(akcs.a, zpoVar), "com/android/dialer/incall/core/call/events/impl/PhoneAccountSelectionEventState", "update", ':', "PhoneAccountSelectionEventState.java", zct.b);
                return j$.util.Optional.of(this.c);
        }
    }

    @Override // defpackage.pug
    public final java.lang.String b() {
        return "PHONE_ACCOUNT_SELECTION";
    }

    @Override // defpackage.pug
    public final void c() {
        this.b.a(new defpackage.pui(0));
    }
}
