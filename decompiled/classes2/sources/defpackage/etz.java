package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class etz implements android.os.Handler.Callback {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public etz(yda ydaVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ydaVar);
        this.a = ydaVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        int i = this.$cid;
        if (i == 0) {
            int i2 = message.what;
            java.lang.Object obj = this.a;
            if (i2 == 1) {
                ((defpackage.eub) ((defpackage.iay) obj).b).a();
            } else if (i2 == 2) {
                ((defpackage.euc) ((defpackage.iay) obj).i).a();
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        ((defpackage.eue) ((defpackage.iay) obj).c).a();
                    }
                    return false;
                }
                ((defpackage.eud) ((defpackage.iay) obj).h).a();
            }
            return true;
        }
        if (i == 1) {
            defpackage.eto etoVar = (defpackage.eto) this.a;
            defpackage.etm etmVar = etoVar.b;
            ahvr.ci(etmVar);
            for (defpackage.etn etnVar : etoVar.c) {
                if (!etnVar.c && etnVar.b) {
                    defpackage.eqd eqdVarG = etnVar.d.g();
                    etnVar.d = new ygq((byte[]) null);
                    etnVar.b = false;
                    etmVar.a(etnVar.a, eqdVarG);
                }
                defpackage.etk etkVar = etoVar.a;
                ahvr.ci(etkVar);
                if (etkVar.c(1)) {
                    break;
                }
            }
        } else if (i != 2) {
            int i3 = message.arg1;
            java.lang.Object obj2 = this.a;
            if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
                android.util.Log.d("MessengerIpcClient", a.bj(i3, "Received response to request: "));
            }
            synchronized (obj2) {
                android.util.SparseArray sparseArray = ((aabg) obj2).d;
                aabi aabiVar = (aabi) sparseArray.get(i3);
                if (aabiVar == null) {
                    android.util.Log.w("MessengerIpcClient", a.bj(i3, "Received response for unknown request: "));
                } else {
                    sparseArray.remove(i3);
                    ((aabg) obj2).d();
                    android.os.Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        aabiVar.c(new aabj("Not supported by GmsCore", (java.lang.Throwable) null));
                    } else {
                        aabiVar.a(data);
                    }
                }
            }
        } else {
            if (message.what != 1) {
                if (message.what == 2) {
                    ((yda) this.a).c.h((ycz) message.obj);
                }
                return false;
            }
            ((yda) this.a).c((ycz) message.obj);
        }
        return true;
    }

    public /* synthetic */ etz(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
