package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anwy extends defpackage.aoaf {
    private boolean b;
    private final anqw c;
    private final defpackage.anvq d;
    private final anmg[] e;

    public anwy(anqw anqwVar, defpackage.anvq anvqVar, anmg[] anmgVarArr) {
        ahvr.bN(!anqwVar.h(), "error must not be OK");
        this.c = anqwVar;
        this.d = anvqVar;
        this.e = anmgVarArr;
    }

    @Override // defpackage.aoaf, defpackage.anvp
    public final void b(defpackage.anxu anxuVar) {
        anxuVar.b("error", this.c);
        anxuVar.b("progress", this.d);
    }

    @Override // defpackage.aoaf, defpackage.anvp
    public final void m(defpackage.anvr anvrVar) {
        ahvr.bZ(!this.b, "already started");
        this.b = true;
        int i = 0;
        while (true) {
            anmg[] anmgVarArr = this.e;
            if (i >= anmgVarArr.length) {
                anvrVar.a(this.c, this.d, new anph());
                return;
            } else {
                anmg anmgVar = anmgVarArr[i];
                i++;
            }
        }
    }

    public anwy(anqw anqwVar, anmg[] anmgVarArr) {
        this(anqwVar, defpackage.anvq.a, anmgVarArr);
    }
}
