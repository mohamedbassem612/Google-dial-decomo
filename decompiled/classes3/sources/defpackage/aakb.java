package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aakb implements java.io.Closeable {
    public final java.util.concurrent.Executor a;
    public final aaju b;
    public final defpackage.aajm c;
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final gat e;
    private final java.lang.String f;
    private final defpackage.aajl g;
    private defpackage.aaja h;
    private final aiyy i;

    public aakb(gat gatVar, java.util.concurrent.Executor executor, aaju aajuVar, java.lang.String str, defpackage.aajm aajmVar, defpackage.aajl aajlVar, aiyy aiyyVar, defpackage.aaja aajaVar) {
        this.e = gatVar;
        this.a = executor;
        this.b = aajuVar;
        this.f = str;
        this.c = aajmVar;
        this.g = aajlVar;
        this.i = aiyyVar;
        this.h = aajaVar;
    }

    private final synchronized byte[] c(java.util.Map map) {
        byte[] bArrCreateByteArray;
        if (e(this.h)) {
            throw new aacw(new com.google.android.gms.common.api.Status(20, "The handle object on the module side is unreachable", (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null));
        }
        try {
            defpackage.aaja aajaVar = this.h;
            android.os.Parcel parcelEP = aajaVar.eP();
            parcelEP.writeMap(map);
            android.os.Parcel parcelEQ = aajaVar.eQ(2, parcelEP);
            bArrCreateByteArray = parcelEQ.createByteArray();
            parcelEQ.recycle();
            if (bArrCreateByteArray == null) {
                throw new aacw(new com.google.android.gms.common.api.Status(8, "Received null response on snapshot", (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null));
            }
        } catch (android.os.RemoteException e) {
            throw aaoo.s(e, "Failed to get a snapshot");
        }
        return bArrCreateByteArray;
    }

    private final synchronized void d(aagp aagpVar, defpackage.aajl aajlVar) {
        defpackage.aajm aajmVar = this.c;
        if (aajmVar.a && e(this.h)) {
            aajlVar.c(2, defpackage.aajk.b);
            this.h = ahbq.k(aagpVar, this.f, aajmVar, this.e.v(), aajlVar).a;
        }
    }

    private static boolean e(defpackage.aaja aajaVar) {
        return aajaVar == null || !((ylb) aajaVar).a.pingBinder();
    }

    public final synchronized void a() {
        if (e(this.h)) {
            android.util.Log.w("DGInternalHandle", "The handle object on the module side is unreachable for close");
            return;
        }
        try {
            defpackage.aaja aajaVar = this.h;
            aajaVar.eS(3, aajaVar.eP());
        } catch (android.os.RemoteException e) {
            android.util.Log.e("DGInternalHandle", "Error while closing the handle: ".concat(java.lang.String.valueOf(e.getMessage())));
        }
        this.h = null;
    }

    public final synchronized defpackage.uzx b(aagp aagpVar, java.util.Map map) {
        defpackage.aajl aajlVarClone;
        byte[] bArrC;
        aajlVarClone = this.g.clone();
        d(aagpVar, aajlVarClone);
        defpackage.aajk aajkVar = defpackage.aajk.b;
        aajlVarClone.c(14, aajkVar);
        aiyy aiyyVar = this.i;
        if (aiyyVar.e()) {
            java.lang.String strA = aiyyVar.c().a();
            java.util.HashMap map2 = new java.util.HashMap(map);
            map2.put("_seigd", strA);
            android.util.Log.d("DGInternalHandle", "maybeAddInteractionEvents(): Created a copy of the content binding Map and added the serialized interaction events under key '_seigd'.");
            map = map2;
        } else {
            android.util.Log.d("DGInternalHandle", "maybeAddInteractionEvents(): The EventCollector is not initialized. This means that the client hasn't intended to collect any interaction events so far.");
        }
        bArrC = c(map);
        aajlVarClone.c(15, aajkVar);
        return new defpackage.uzx((java.lang.Object) aaoo.u(aaoo.t(((aagf) aagpVar).b, bArrC, aajlVarClone.b())));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d.getAndSet(true)) {
            android.util.Log.w("DGInternalHandle", "Handle is already closed");
        } else {
            this.e.w(2, 3, new defpackage.aajq() { // from class: aajy
                @Override // defpackage.aajq
                public final java.lang.Object a(aagp aagpVar) {
                    this.a.a();
                    return null;
                }
            }).q(new aajz(0));
        }
    }
}
