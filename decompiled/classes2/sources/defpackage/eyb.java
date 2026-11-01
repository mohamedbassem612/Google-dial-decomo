package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eyb {
    public final java.lang.ref.WeakReference a;
    public final java.util.function.IntConsumer b;
    public final /* synthetic */ defpackage.eyc c;

    public eyb(defpackage.eyc eycVar, android.content.Context context) {
        j$.util.Objects.requireNonNull(eycVar);
        this.c = eycVar;
        this.a = new java.lang.ref.WeakReference(context);
        qgy qgyVar = new qgy(this, 1);
        this.b = qgyVar;
        defpackage.etk etkVarB = eycVar.k.b(eycVar.j, null);
        j$.util.Objects.requireNonNull(etkVarB);
        rp$.ExternalSyntheticApiModelOutline0.m(context, new defpackage.fbk(etkVarB, 1), qgyVar);
    }
}
