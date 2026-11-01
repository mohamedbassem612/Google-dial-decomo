package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afjp extends android.os.CountDownTimer {
    final /* synthetic */ amhl a;
    final /* synthetic */ afjq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afjp(afjq afjqVar, long j, amhl amhlVar) {
        super(j, 100L);
        this.a = amhlVar;
        j$.util.Objects.requireNonNull(afjqVar);
        this.b = afjqVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        afjq afjqVar = this.b;
        afjqVar.e.b(afjqVar.a(this.a));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
