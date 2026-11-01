package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kwu implements qbb {
    private static final aimz a = aimz.i("com/android/dialer/callrecording/impl/logger/CallRecordingCallEventPopulator");
    private final defpackage.kww b;

    public kwu(defpackage.kww kwwVar) {
        this.b = kwwVar;
    }

    public final ajcq a() {
        a.b().l("com/android/dialer/callrecording/impl/logger/CallRecordingCallEventPopulator", "getSubMessage", 31, "CallRecordingCallEventPopulator.java").v("logging call recording metrics");
        defpackage.kww kwwVar = this.b;
        return kwwVar.n.h(new defpackage.ibg(kwwVar, 8), kwwVar.c);
    }

    public final /* synthetic */ void b(akzx akzxVar, java.lang.Object obj) {
        amoz amozVar = (amoz) obj;
        akzxVar.u();
        amow amowVar = akzxVar.b;
        amow amowVar2 = amow.a;
        j$.util.Objects.requireNonNull(amozVar);
        amowVar.V = amozVar;
        amowVar.c |= 262144;
    }
}
