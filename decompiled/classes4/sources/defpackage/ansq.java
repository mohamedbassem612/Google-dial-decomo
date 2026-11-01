package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class ansq extends defpackage.anst {
    public ansq(defpackage.ansd ansdVar, defpackage.anlw anlwVar, int i) {
        super(ansdVar, anlwVar, i);
    }

    @Override // defpackage.anst
    protected final void a(anqw anqwVar) {
        ((defpackage.aocy) this.g).a(anqwVar);
    }

    @Override // defpackage.anst
    protected final void b() {
        ((defpackage.aocy) this.g).b();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: anqx */
    @Override // defpackage.anst
    public final void c(int i, android.os.Parcel parcel) throws anqx {
        defpackage.aodj aodjVar;
        java.lang.String string = parcel.readString();
        defpackage.anlw anlwVar = this.c;
        anph anphVarA = defpackage.antb.a(parcel, anlwVar);
        defpackage.ansf ansfVar = this.b;
        defpackage.ansd ansdVar = (defpackage.ansd) ansfVar;
        java.util.List list = ansdVar.a;
        defpackage.aodj aodjVar2 = defpackage.aodj.a;
        if (list.isEmpty()) {
            aodjVar = defpackage.aodj.a;
        } else {
            int size = list.size();
            aooc[] aoocVarArr = new aooc[size];
            for (int i2 = 0; i2 < size; i2++) {
                aoocVarArr[i2] = ((defpackage.anqp) list.get(i2)).a();
            }
            aodjVar = new defpackage.aodj(aoocVarArr);
        }
        defpackage.antj antjVar = new defpackage.antj(ansfVar, this.d, aodjVar);
        anqw anqwVarA = ansdVar.a((i & 16) != 0 ? new defpackage.antv(this, antjVar, anlwVar) : new defpackage.antd(this, antjVar, anlwVar), string, anphVarA);
        if (!anqwVarA.h()) {
            super.h(anqwVarA, anqwVarA, false);
            return;
        }
        ahvr.ci((defpackage.aocy) this.g);
        if (ansdVar.z()) {
            ((defpackage.aocy) this.g).e();
        }
    }

    final void f() {
        if (p()) {
            return;
        }
        m(defpackage.ansr.f);
        this.f.f();
        ((defpackage.aocy) this.g).a(anqw.b);
    }

    @Override // defpackage.anst
    public final void d(int i, android.os.Parcel parcel) {
    }
}
