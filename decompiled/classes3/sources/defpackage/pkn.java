package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pkn extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public pkn(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.pkn.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        defpackage.sql sqlVar = (defpackage.sql) list.get(0);
        defpackage.zmy zmyVar = (defpackage.zmy) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        if (((java.lang.Boolean) list.get(3)).booleanValue() || zBooleanValue || zmyVar != defpackage.zmy.a) {
            optionalOf = j$.util.Optional.of(java.lang.Boolean.FALSE);
        } else {
            if (sqlVar.b != defpackage.sqk.b) {
                defpackage.spk spkVar = sqlVar.a.e;
                if (spkVar == null) {
                    spkVar = defpackage.spk.a;
                }
                int iAQ = a.aQ(spkVar.d);
                if (iAQ != 0 && iAQ == 2) {
                    z = true;
                }
            }
            optionalOf = j$.util.Optional.of(java.lang.Boolean.valueOf(z));
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
