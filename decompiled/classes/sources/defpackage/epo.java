package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class epo extends android.os.Handler {
    final /* synthetic */ defpackage.epq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epo(defpackage.epq epqVar, android.os.Looper looper) {
        super(looper);
        this.a = epqVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int size;
        defpackage.ils[] ilsVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        defpackage.epq epqVar = this.a;
        while (true) {
            synchronized (epqVar.b) {
                java.util.ArrayList arrayList = epqVar.c;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                ilsVarArr = new defpackage.ils[size];
                arrayList.toArray(ilsVarArr);
                arrayList.clear();
            }
            for (int i = 0; i < size; i++) {
                defpackage.ils ilsVar = ilsVarArr[i];
                java.util.ArrayList arrayList2 = (java.util.ArrayList) ilsVar.b;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    defpackage.epp eppVar = (defpackage.epp) arrayList2.get(i2);
                    if (!eppVar.d) {
                        eppVar.b.onReceive(epqVar.a, (android.content.Intent) ilsVar.a);
                    }
                }
            }
        }
    }
}
