package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mbp implements zbp {
    private final kaw a;

    public mbp(kaw kawVar) {
        this.a = kawVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final void a(zbo zboVar) throws aois {
        if (zboVar instanceof zbx) {
            zbx zbxVar = (zbx) zboVar;
            zbz zbzVar = zbxVar.a;
            j$.util.Objects.checkIndex(0, 5);
            if (zbzVar instanceof zbz) {
                this.a.Z(zbzVar.a, zbxVar.b);
                return;
            }
            if (zbzVar instanceof zby) {
                this.a.W(((zby) zbzVar).a, zbxVar.b);
            } else if (zbzVar instanceof zcb) {
                this.a.Y(((zcb) zbzVar).a, zbxVar.b);
            } else {
                if (!(zbzVar instanceof zca)) {
                    throw new aois();
                }
                this.a.X(((zca) zbzVar).a, zbxVar.b);
            }
        }
    }
}
