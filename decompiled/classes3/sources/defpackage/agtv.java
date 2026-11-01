package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agtv extends aomd {
    public java.lang.Object a;
    public java.lang.Object b;
    public /* synthetic */ java.lang.Object c;
    public int d;
    public android.content.ContentValues e;
    final /* synthetic */ aogc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agtv(aogc aogcVar, aoln aolnVar) {
        super(aolnVar);
        this.f = aogcVar;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f.A((android.net.Uri) null, (android.content.ContentValues) null, this);
    }
}
