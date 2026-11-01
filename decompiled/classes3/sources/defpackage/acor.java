package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acor implements defpackage.acnm {
    private final defpackage.acnm a;
    private final defpackage.acnm b;
    private final java.util.Map c;

    public acor(defpackage.acnm acnmVar, java.util.Map map) {
        final int i = 0;
        this.a = new defpackage.acnm() { // from class: acoq
            @Override // defpackage.acnm
            public final /* synthetic */ ahyn a(aclv aclvVar) {
                int i2 = i;
                return ahwt.a;
            }

            @Override // defpackage.acnm
            public final /* synthetic */ ahyn b(aclv aclvVar) {
                int i2 = i;
                return ahwt.a;
            }

            @Override // defpackage.acnm
            public final /* synthetic */ ahyn c(aclv aclvVar) {
                int i2 = i;
                return ahwt.a;
            }

            @Override // defpackage.acnm
            public final /* synthetic */ ajcq d(aclv aclvVar, ajcq ajcqVar) {
                return i != 0 ? aaoo.ax() : aaoo.ax();
            }

            @Override // defpackage.acnm
            public final /* synthetic */ ajcq e(aclv aclvVar, ajcq ajcqVar) {
                return i != 0 ? aiql.z((java.lang.Object) null) : aiql.z((java.lang.Object) null);
            }

            @Override // defpackage.acnm
            public final java.lang.String f(aclv aclvVar) {
                return i != 0 ? "ANDROID_DIALER" : "";
            }

            @Override // defpackage.acnm
            public final /* synthetic */ ajcq g() {
                throw null;
            }

            @Override // defpackage.acnm
            public final /* synthetic */ void h(aclv aclvVar) {
            }
        };
        this.b = acnmVar;
        this.c = map;
    }

    private final defpackage.acnm i(aclv aclvVar) {
        if (!(aclvVar instanceof acni)) {
            return this.a;
        }
        acni acniVar = (acni) aclvVar;
        acmi acmiVarA = acniVar.a();
        apdi apdiVar = defpackage.acot.a;
        acmiVarA.c(apdiVar);
        akzs akzsVar = ((alaa) acmiVarA).n;
        alac alacVar = (alac) apdiVar.a;
        if (!akzsVar.l(alacVar)) {
            return this.b;
        }
        acmi acmiVarA2 = acniVar.a();
        acmiVarA2.c(apdiVar);
        java.lang.Object objJ = ((alaa) acmiVarA2).n.j(alacVar);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        java.lang.String str = ((defpackage.acos) objJ).c;
        defpackage.acnm acnmVar = (defpackage.acnm) this.c.get(str);
        ahvr.cl(acnmVar, "No config for: %s", str);
        return acnmVar;
    }

    @Override // defpackage.acnm
    public final ahyn a(aclv aclvVar) {
        return i(aclvVar).a(aclvVar);
    }

    @Override // defpackage.acnm
    public final ahyn b(aclv aclvVar) {
        return i(aclvVar).b(aclvVar);
    }

    @Override // defpackage.acnm
    public final ahyn c(aclv aclvVar) {
        return i(aclvVar).c(aclvVar);
    }

    @Override // defpackage.acnm
    public final ajcq d(aclv aclvVar, ajcq ajcqVar) {
        return i(aclvVar).d(aclvVar, ajcqVar);
    }

    @Override // defpackage.acnm
    public final ajcq e(aclv aclvVar, ajcq ajcqVar) {
        return i(aclvVar).e(aclvVar, ajcqVar);
    }

    @Override // defpackage.acnm
    public final java.lang.String f(aclv aclvVar) {
        return i(aclvVar).f(aclvVar);
    }

    @Override // defpackage.acnm
    public final ajcq g() {
        return aiql.z((java.lang.Object) null);
    }

    @Override // defpackage.acnm
    public final void h(aclv aclvVar) {
        i(aclvVar).h(aclvVar);
    }
}
