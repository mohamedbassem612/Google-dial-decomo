package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hlw extends aomd {
    public /* synthetic */ java.lang.Object a;
    final /* synthetic */ com.android.dialer.androidauto.impl.caricons.CarIconContentProvider b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlw(com.android.dialer.androidauto.impl.caricons.CarIconContentProvider carIconContentProvider, aoln aolnVar) {
        super(aolnVar);
        this.b = carIconContentProvider;
    }

    public final java.lang.Object b(java.lang.Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c((android.net.Uri) null, this);
    }
}
