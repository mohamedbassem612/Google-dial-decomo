package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class whu implements java.lang.Runnable {
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ java.util.function.Consumer b;
    public final /* synthetic */ defpackage.voc c;

    public /* synthetic */ whu(defpackage.voc vocVar, java.lang.String str, java.util.function.Consumer consumer) {
        this.c = vocVar;
        this.a = str;
        this.b = consumer;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r0 = this.c.a;
        java.lang.String str = this.a;
        akzx akzxVar = (akzx) r0.get(str);
        java.util.function.Consumer consumer = this.b;
        if (akzxVar != null) {
            aa$.ExternalSyntheticApiModelOutline1.m(consumer, akzxVar);
            return;
        }
        akzx akzxVarM = defpackage.whw.a.m();
        aa$.ExternalSyntheticApiModelOutline1.m(consumer, akzxVarM);
        r0.put(str, akzxVarM);
    }
}
