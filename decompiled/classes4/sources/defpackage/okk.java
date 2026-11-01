package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class okk implements java.util.function.Function {
    public final /* synthetic */ android.telephony.VisualVoicemailSmsFilterSettings a;

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.String str;
        defpackage.da$$ExternalSyntheticApiModelOutline1.m80m(obj);
        kaw kawVarAQ = gus.aQ(mhc.a.m());
        android.telephony.VisualVoicemailSmsFilterSettings visualVoicemailSmsFilterSettings = this.a;
        if (visualVoicemailSmsFilterSettings == null) {
            str = "null";
        } else {
            str = "[clientPrefix: " + visualVoicemailSmsFilterSettings.clientPrefix + ", destinationPort: " + visualVoicemailSmsFilterSettings.destinationPort + ']';
        }
        kawVarAQ.N(str);
        return kawVarAQ.L();
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
