package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class gxa implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ gxa(int i, java.lang.String str, int i2) {
        this.$cid = i2;
        this.b = "UPDATE workspec SET stop_reason=? WHERE id=?";
        this.a = i;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e8  */
    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        defpackage.cay cayVar;
        int i;
        int i2 = this.$cid;
        if (i2 == 0) {
            defpackage.gjh gjhVar = (defpackage.gjh) obj;
            int i3 = this.a;
            java.lang.Object obj2 = this.c;
            if (gjhVar == null) {
                defpackage.aooh.i("_connection");
            }
            defpackage.gin ginVarA = gjhVar.a((java.lang.String) this.b);
            try {
                ginVarA.j(1, (java.lang.String) obj2);
                ginVarA.h(2, i3);
                return ginVarA.m() ? new defpackage.gwy(ginVarA.e(defpackage.dzk.S(ginVarA, "work_spec_id")), (int) ginVarA.c(defpackage.dzk.S(ginVarA, "generation")), (int) ginVarA.c(defpackage.dzk.S(ginVarA, "system_id"))) : null;
            } finally {
                ginVarA.close();
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                defpackage.gjh gjhVar2 = (defpackage.gjh) obj;
                int i4 = this.a;
                java.lang.Object obj3 = this.c;
                if (gjhVar2 == null) {
                    defpackage.aooh.i("_connection");
                }
                defpackage.gin ginVarA2 = gjhVar2.a((java.lang.String) this.b);
                try {
                    ginVarA2.j(1, (java.lang.String) obj3);
                    ginVarA2.h(2, i4);
                    ginVarA2.m();
                    return defpackage.aojh.a;
                } finally {
                    ginVarA2.close();
                }
            }
            defpackage.gjh gjhVar3 = (defpackage.gjh) obj;
            java.lang.Object obj4 = this.c;
            int i5 = this.a;
            if (gjhVar3 == null) {
                defpackage.aooh.i("_connection");
            }
            defpackage.gin ginVarA3 = gjhVar3.a((java.lang.String) this.b);
            try {
                ginVarA3.h(1, i5);
                ginVarA3.j(2, (java.lang.String) obj4);
                ginVarA3.m();
                return defpackage.aojh.a;
            } finally {
                ginVarA3.close();
            }
        }
        defpackage.cay cayVar2 = (defpackage.cay) obj;
        java.lang.Object obj5 = this.c;
        defpackage.cdk cdkVar = (defpackage.cdk) obj5;
        int i6 = cdkVar.d;
        int i7 = this.a;
        if (i6 == i7) {
            java.lang.Object obj6 = this.b;
            if (defpackage.aooh.n(obj6, cdkVar.f) && (cayVar2 instanceof defpackage.cbb)) {
                defpackage.ado adoVar = (defpackage.ado) obj6;
                long[] jArr = adoVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j = jArr[i8];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = i8 - length;
                            int i10 = 0;
                            while (true) {
                                i = 8 - ((~i9) >>> 31);
                                if (i10 >= i) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    int i11 = (i8 << 3) + i10;
                                    java.lang.Object obj7 = adoVar.b[i11];
                                    if (adoVar.c[i11] != i7) {
                                        defpackage.cbb cbbVar = (defpackage.cbb) cayVar2;
                                        defpackage.adw adwVar = cbbVar.o;
                                        defpackage.cfg.c(adwVar, obj7, obj5);
                                        if (obj7 instanceof defpackage.ckg) {
                                            defpackage.ckg ckgVar = (defpackage.ckg) obj7;
                                            if (!defpackage.adw.f(adwVar, ckgVar)) {
                                                defpackage.cfg.b(cbbVar.p, ckgVar);
                                            }
                                            defpackage.adw adwVar2 = cdkVar.g;
                                            if (adwVar2 != null) {
                                                adwVar2.i(obj7);
                                            }
                                        }
                                        adoVar.g(i11);
                                    }
                                }
                                j >>= 8;
                                i10++;
                                cayVar2 = cayVar2;
                            }
                            cayVar = cayVar2;
                            if (i != 8) {
                                break;
                            }
                        } else {
                            cayVar = cayVar2;
                        }
                        if (i8 == length) {
                            break;
                        }
                        i8++;
                        cayVar2 = cayVar;
                    }
                }
            }
        }
        return defpackage.aojh.a;
    }

    public /* synthetic */ gxa(defpackage.cdk cdkVar, int i, defpackage.ado adoVar, int i2) {
        this.$cid = i2;
        this.c = cdkVar;
        this.a = i;
        this.b = adoVar;
    }

    public /* synthetic */ gxa(java.lang.String str, int i, int i2) {
        this.$cid = i2;
        this.b = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?";
        this.c = str;
        this.a = i;
    }

    public /* synthetic */ gxa(java.lang.String str, int i, int i2, byte[] bArr) {
        this.$cid = i2;
        this.b = "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        this.c = str;
        this.a = i;
    }
}
