package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class max extends android.os.CountDownTimer {
    final /* synthetic */ ajxi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public max(mni mniVar, long j, long j2, ajxi ajxiVar) {
        super(j, j2);
        this.a = ajxiVar;
        j$.util.Objects.requireNonNull(mniVar);
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        ajxi ajxiVar = this.a;
        ((android.widget.TextView) ajxiVar.a).setText(((rgr) ajxiVar.c).b);
        ((rhd) ajxiVar.b).c = j$.util.Optional.empty();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        ajxi ajxiVar = this.a;
        ((android.widget.TextView) ajxiVar.a).setText(android.text.TextUtils.expandTemplate(((rhd) ajxiVar.b).a.getText(((rgr) ajxiVar.c).a), java.lang.String.valueOf(((int) j) / 1000)));
    }
}
