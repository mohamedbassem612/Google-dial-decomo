package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vmp implements java.util.function.Supplier {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vmp(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v13, types: [ahzi, java.lang.Object] */
    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        switch (this.$cid) {
            case 0:
                j$.util.Optional optionalG = ((defpackage.zjm) ((defpackage.ahbv) this.a).f).g();
                if (true == optionalG.isPresent()) {
                    optionalG = j$.util.Optional.ofNullable(((defpackage.vda) optionalG.get()).d());
                }
                return (java.lang.Boolean) optionalG.orElse(java.lang.Boolean.FALSE);
            case 1:
                return (defpackage.ajcq) this.a.eZ();
            case 2:
                defpackage.aaif aaifVar = (defpackage.aaif) this.a;
                int i = aaifVar.a;
                int i2 = i - 1;
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    return aaifVar.f() ? ((android.content.Context) aaifVar.c).getString(2132017345) : ((android.content.Context) aaifVar.c).getString(2132017342);
                }
                throw new defpackage.xei(java.lang.String.format("Action text unavailable for category: %s", defpackage.ttj.j(i)));
            case 3:
                defpackage.aaif aaifVar2 = (defpackage.aaif) this.a;
                return aaifVar2.f() ? ((android.content.Context) aaifVar2.c).getString(2132019749) : ((android.content.Context) aaifVar2.c).getString(2132019748);
            case 4:
                defpackage.aaif aaifVar3 = (defpackage.aaif) this.a;
                int i3 = aaifVar3.a;
                int i4 = i3 - 1;
                if (i4 == 0) {
                    return aaifVar3.f() ? ((android.content.Context) aaifVar3.c).getString(2132019882) : ((android.content.Context) aaifVar3.c).getString(2132019881);
                }
                if (i4 == 4 || i4 == 5) {
                    return aaifVar3.f() ? ((android.content.Context) aaifVar3.c).getString(2132019880) : ((android.content.Context) aaifVar3.c).getString(2132019879);
                }
                throw new defpackage.xei(java.lang.String.format("Action text unavailable for category: %s", defpackage.ttj.j(i3)));
            case 5:
                defpackage.aaif aaifVar4 = (defpackage.aaif) this.a;
                return aaifVar4.f() ? ((android.content.Context) aaifVar4.c).getString(2132019887) : ((android.content.Context) aaifVar4.c).getString(2132019886);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aaif aaifVar5 = (defpackage.aaif) this.a;
                int i5 = aaifVar5.a;
                if (i5 - 1 == 3) {
                    return aaifVar5.f() ? ((android.content.Context) aaifVar5.c).getString(2132019891) : ((android.content.Context) aaifVar5.c).getString(2132019890);
                }
                throw new defpackage.xei(java.lang.String.format("Action text unavailable for category: %s", defpackage.ttj.j(i5)));
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aaif aaifVar6 = (defpackage.aaif) this.a;
                return aaifVar6.f() ? ((android.content.Context) aaifVar6.c).getString(2132019899) : ((android.content.Context) aaifVar6.c).getString(2132019898);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aaif aaifVar7 = (defpackage.aaif) this.a;
                int i6 = aaifVar7.a - 1;
                if (i6 == 0 || i6 == 4 || i6 == 5) {
                    return aaifVar7.f() ? ((android.content.Context) aaifVar7.c).getString(2132020268) : ((android.content.Context) aaifVar7.c).getString(2132020263);
                }
                return aaifVar7.f() ? ((android.content.Context) aaifVar7.c).getString(2132020262) : ((android.content.Context) aaifVar7.c).getString(2132020257);
            case 9:
                defpackage.aaif aaifVar8 = (defpackage.aaif) this.a;
                int i7 = aaifVar8.a;
                int i8 = i7 - 1;
                if (i8 == 1 || i8 == 2 || i8 == 3 || i8 == 5) {
                    return aaifVar8.f() ? ((android.content.Context) aaifVar8.c).getString(2132020680) : ((android.content.Context) aaifVar8.c).getString(2132020679);
                }
                throw new defpackage.xei(java.lang.String.format("Action text unavailable for category: %s", defpackage.ttj.j(i7)));
            case 10:
                defpackage.aaif aaifVar9 = (defpackage.aaif) this.a;
                int i9 = aaifVar9.a;
                int i10 = i9 - 1;
                if (i10 == 1 || i10 == 2) {
                    return aaifVar9.f() ? ((android.content.Context) aaifVar9.c).getString(2132020684) : ((android.content.Context) aaifVar9.c).getString(2132020681);
                }
                throw new defpackage.xei(java.lang.String.format("Action text unavailable for category: %s", defpackage.ttj.j(i9)));
            case 11:
                defpackage.aaif aaifVar10 = (defpackage.aaif) this.a;
                return aaifVar10.f() ? ((android.content.Context) aaifVar10.c).getString(2132017349) : ((android.content.Context) aaifVar10.c).getString(2132017346);
            case 12:
                defpackage.aaif aaifVar11 = (defpackage.aaif) this.a;
                int i11 = aaifVar11.a;
                int i12 = i11 - 1;
                if (i12 == 0 || i12 == 4 || i12 == 5) {
                    return aaifVar11.f() ? ((android.content.Context) aaifVar11.c).getString(2132017357) : ((android.content.Context) aaifVar11.c).getString(2132017354);
                }
                throw new defpackage.xei(java.lang.String.format("Action text unavailable for category: %s", defpackage.ttj.j(i11)));
            case 13:
                defpackage.aaif aaifVar12 = (defpackage.aaif) this.a;
                return aaifVar12.f() ? ((android.content.Context) aaifVar12.c).getString(2132017990) : ((android.content.Context) aaifVar12.c).getString(2132017987);
            case 14:
                defpackage.aaif aaifVar13 = (defpackage.aaif) this.a;
                int i13 = aaifVar13.a - 1;
                if (i13 == 0 || i13 == 4 || i13 == 5) {
                    return aaifVar13.f() ? ((android.content.Context) aaifVar13.c).getString(2132018545) : ((android.content.Context) aaifVar13.c).getString(2132018544);
                }
                return aaifVar13.f() ? ((android.content.Context) aaifVar13.c).getString(2132018543) : ((android.content.Context) aaifVar13.c).getString(2132018542);
            case 15:
                defpackage.aaif aaifVar14 = (defpackage.aaif) this.a;
                return aaifVar14.f() ? ((android.content.Context) aaifVar14.c).getString(2132019139) : ((android.content.Context) aaifVar14.c).getString(2132019138);
            case 16:
                return defpackage.anov.c().b(((defpackage.abaa) this.a).a).a();
            case 17:
                defpackage.aogc aogcVar = (defpackage.aogc) this.a;
                return aogcVar.Z(((defpackage.adon) aogcVar.c).a);
            case 18:
                defpackage.aogc aogcVar2 = (defpackage.aogc) this.a;
                return aogcVar2.aa(((defpackage.adon) aogcVar2.c).b);
            default:
                return java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT >= 31 ? ((defpackage.gsg) this.a).e() : -1);
        }
    }
}
