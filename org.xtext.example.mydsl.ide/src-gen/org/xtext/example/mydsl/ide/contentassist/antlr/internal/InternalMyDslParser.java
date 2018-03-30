package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'datatype'", "':'", "'entity'", "'{'", "'}'", "'extends'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDomainModel"
    // InternalMyDsl.g:53:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleDomainModel EOF )
            // InternalMyDsl.g:55:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainModel();

            state._fsp--;

             after(grammarAccess.getDomainModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalMyDsl.g:62:1: ruleDomainModel : ( ( rule__DomainModel__ElementsAssignment )* ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__DomainModel__ElementsAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__DomainModel__ElementsAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__DomainModel__ElementsAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__DomainModel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainModelAccess().getElementsAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__DomainModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__DomainModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DomainModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleDataType"
    // InternalMyDsl.g:78:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleDataType EOF )
            // InternalMyDsl.g:80:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalMyDsl.g:87:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__DataType__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__DataType__Group__0 )
            // InternalMyDsl.g:94:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleFeatures"
    // InternalMyDsl.g:103:1: entryRuleFeatures : ruleFeatures EOF ;
    public final void entryRuleFeatures() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleFeatures EOF )
            // InternalMyDsl.g:105:1: ruleFeatures EOF
            {
             before(grammarAccess.getFeaturesRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatures();

            state._fsp--;

             after(grammarAccess.getFeaturesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatures"


    // $ANTLR start "ruleFeatures"
    // InternalMyDsl.g:112:1: ruleFeatures : ( ( rule__Features__Group__0 ) ) ;
    public final void ruleFeatures() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Features__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Features__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Features__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Features__Group__0 )
            {
             before(grammarAccess.getFeaturesAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Features__Group__0 )
            // InternalMyDsl.g:119:4: rule__Features__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Features__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeaturesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatures"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:128:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleType EOF )
            // InternalMyDsl.g:130:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:137:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:144:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:153:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleEntity EOF )
            // InternalMyDsl.g:155:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:162:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Entity__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Entity__Group__0 )
            // InternalMyDsl.g:169:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:177:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:181:1: ( ( ruleDataType ) | ( ruleEntity ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:182:2: ( ruleDataType )
                    {
                    // InternalMyDsl.g:182:2: ( ruleDataType )
                    // InternalMyDsl.g:183:3: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:188:2: ( ruleEntity )
                    {
                    // InternalMyDsl.g:188:2: ( ruleEntity )
                    // InternalMyDsl.g:189:3: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalMyDsl.g:198:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:202:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalMyDsl.g:203:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalMyDsl.g:210:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:214:1: ( ( 'datatype' ) )
            // InternalMyDsl.g:215:1: ( 'datatype' )
            {
            // InternalMyDsl.g:215:1: ( 'datatype' )
            // InternalMyDsl.g:216:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalMyDsl.g:225:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:229:1: ( rule__DataType__Group__1__Impl )
            // InternalMyDsl.g:230:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalMyDsl.g:236:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:240:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalMyDsl.g:241:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:241:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalMyDsl.g:242:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:243:2: ( rule__DataType__NameAssignment_1 )
            // InternalMyDsl.g:243:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__Features__Group__0"
    // InternalMyDsl.g:252:1: rule__Features__Group__0 : rule__Features__Group__0__Impl rule__Features__Group__1 ;
    public final void rule__Features__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:256:1: ( rule__Features__Group__0__Impl rule__Features__Group__1 )
            // InternalMyDsl.g:257:2: rule__Features__Group__0__Impl rule__Features__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Features__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Features__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Features__Group__0"


    // $ANTLR start "rule__Features__Group__0__Impl"
    // InternalMyDsl.g:264:1: rule__Features__Group__0__Impl : ( ( rule__Features__NameAssignment_0 ) ) ;
    public final void rule__Features__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:268:1: ( ( ( rule__Features__NameAssignment_0 ) ) )
            // InternalMyDsl.g:269:1: ( ( rule__Features__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:269:1: ( ( rule__Features__NameAssignment_0 ) )
            // InternalMyDsl.g:270:2: ( rule__Features__NameAssignment_0 )
            {
             before(grammarAccess.getFeaturesAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:271:2: ( rule__Features__NameAssignment_0 )
            // InternalMyDsl.g:271:3: rule__Features__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Features__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFeaturesAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Features__Group__0__Impl"


    // $ANTLR start "rule__Features__Group__1"
    // InternalMyDsl.g:279:1: rule__Features__Group__1 : rule__Features__Group__1__Impl rule__Features__Group__2 ;
    public final void rule__Features__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:283:1: ( rule__Features__Group__1__Impl rule__Features__Group__2 )
            // InternalMyDsl.g:284:2: rule__Features__Group__1__Impl rule__Features__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Features__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Features__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Features__Group__1"


    // $ANTLR start "rule__Features__Group__1__Impl"
    // InternalMyDsl.g:291:1: rule__Features__Group__1__Impl : ( ':' ) ;
    public final void rule__Features__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:295:1: ( ( ':' ) )
            // InternalMyDsl.g:296:1: ( ':' )
            {
            // InternalMyDsl.g:296:1: ( ':' )
            // InternalMyDsl.g:297:2: ':'
            {
             before(grammarAccess.getFeaturesAccess().getColonKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFeaturesAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Features__Group__1__Impl"


    // $ANTLR start "rule__Features__Group__2"
    // InternalMyDsl.g:306:1: rule__Features__Group__2 : rule__Features__Group__2__Impl ;
    public final void rule__Features__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:310:1: ( rule__Features__Group__2__Impl )
            // InternalMyDsl.g:311:2: rule__Features__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Features__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Features__Group__2"


    // $ANTLR start "rule__Features__Group__2__Impl"
    // InternalMyDsl.g:317:1: rule__Features__Group__2__Impl : ( ( rule__Features__TypeAssignment_2 ) ) ;
    public final void rule__Features__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:321:1: ( ( ( rule__Features__TypeAssignment_2 ) ) )
            // InternalMyDsl.g:322:1: ( ( rule__Features__TypeAssignment_2 ) )
            {
            // InternalMyDsl.g:322:1: ( ( rule__Features__TypeAssignment_2 ) )
            // InternalMyDsl.g:323:2: ( rule__Features__TypeAssignment_2 )
            {
             before(grammarAccess.getFeaturesAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:324:2: ( rule__Features__TypeAssignment_2 )
            // InternalMyDsl.g:324:3: rule__Features__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Features__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeaturesAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Features__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalMyDsl.g:333:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:337:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyDsl.g:338:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalMyDsl.g:345:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:349:1: ( ( 'entity' ) )
            // InternalMyDsl.g:350:1: ( 'entity' )
            {
            // InternalMyDsl.g:350:1: ( 'entity' )
            // InternalMyDsl.g:351:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalMyDsl.g:360:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:364:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalMyDsl.g:365:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalMyDsl.g:372:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:376:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:377:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:377:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalMyDsl.g:378:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:379:2: ( rule__Entity__NameAssignment_1 )
            // InternalMyDsl.g:379:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalMyDsl.g:387:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalMyDsl.g:392:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalMyDsl.g:399:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:403:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalMyDsl.g:404:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalMyDsl.g:404:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalMyDsl.g:405:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalMyDsl.g:406:2: ( rule__Entity__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:406:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalMyDsl.g:414:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:418:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalMyDsl.g:419:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalMyDsl.g:426:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:430:1: ( ( '{' ) )
            // InternalMyDsl.g:431:1: ( '{' )
            {
            // InternalMyDsl.g:431:1: ( '{' )
            // InternalMyDsl.g:432:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalMyDsl.g:441:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:445:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalMyDsl.g:446:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalMyDsl.g:453:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FeaturesAssignment_4 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:457:1: ( ( ( rule__Entity__FeaturesAssignment_4 )? ) )
            // InternalMyDsl.g:458:1: ( ( rule__Entity__FeaturesAssignment_4 )? )
            {
            // InternalMyDsl.g:458:1: ( ( rule__Entity__FeaturesAssignment_4 )? )
            // InternalMyDsl.g:459:2: ( rule__Entity__FeaturesAssignment_4 )?
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // InternalMyDsl.g:460:2: ( rule__Entity__FeaturesAssignment_4 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:460:3: rule__Entity__FeaturesAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__FeaturesAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalMyDsl.g:468:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:472:1: ( rule__Entity__Group__5__Impl )
            // InternalMyDsl.g:473:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalMyDsl.g:479:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:483:1: ( ( '}' ) )
            // InternalMyDsl.g:484:1: ( '}' )
            {
            // InternalMyDsl.g:484:1: ( '}' )
            // InternalMyDsl.g:485:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalMyDsl.g:495:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:499:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalMyDsl.g:500:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalMyDsl.g:507:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:511:1: ( ( 'extends' ) )
            // InternalMyDsl.g:512:1: ( 'extends' )
            {
            // InternalMyDsl.g:512:1: ( 'extends' )
            // InternalMyDsl.g:513:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalMyDsl.g:522:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:526:1: ( rule__Entity__Group_2__1__Impl )
            // InternalMyDsl.g:527:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalMyDsl.g:533:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SupertypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:537:1: ( ( ( rule__Entity__SupertypeAssignment_2_1 ) ) )
            // InternalMyDsl.g:538:1: ( ( rule__Entity__SupertypeAssignment_2_1 ) )
            {
            // InternalMyDsl.g:538:1: ( ( rule__Entity__SupertypeAssignment_2_1 ) )
            // InternalMyDsl.g:539:2: ( rule__Entity__SupertypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSupertypeAssignment_2_1()); 
            // InternalMyDsl.g:540:2: ( rule__Entity__SupertypeAssignment_2_1 )
            // InternalMyDsl.g:540:3: rule__Entity__SupertypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SupertypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSupertypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__DomainModel__ElementsAssignment"
    // InternalMyDsl.g:549:1: rule__DomainModel__ElementsAssignment : ( ruleType ) ;
    public final void rule__DomainModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:553:1: ( ( ruleType ) )
            // InternalMyDsl.g:554:2: ( ruleType )
            {
            // InternalMyDsl.g:554:2: ( ruleType )
            // InternalMyDsl.g:555:3: ruleType
            {
             before(grammarAccess.getDomainModelAccess().getElementsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getElementsTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__ElementsAssignment"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalMyDsl.g:564:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:568:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:569:2: ( RULE_ID )
            {
            // InternalMyDsl.g:569:2: ( RULE_ID )
            // InternalMyDsl.g:570:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__Features__NameAssignment_0"
    // InternalMyDsl.g:579:1: rule__Features__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Features__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:584:2: ( RULE_ID )
            {
            // InternalMyDsl.g:584:2: ( RULE_ID )
            // InternalMyDsl.g:585:3: RULE_ID
            {
             before(grammarAccess.getFeaturesAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeaturesAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Features__NameAssignment_0"


    // $ANTLR start "rule__Features__TypeAssignment_2"
    // InternalMyDsl.g:594:1: rule__Features__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Features__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:598:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:599:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:599:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:600:3: ( RULE_ID )
            {
             before(grammarAccess.getFeaturesAccess().getTypeTypeCrossReference_2_0()); 
            // InternalMyDsl.g:601:3: ( RULE_ID )
            // InternalMyDsl.g:602:4: RULE_ID
            {
             before(grammarAccess.getFeaturesAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeaturesAccess().getTypeTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFeaturesAccess().getTypeTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Features__TypeAssignment_2"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalMyDsl.g:613:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:617:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:618:2: ( RULE_ID )
            {
            // InternalMyDsl.g:618:2: ( RULE_ID )
            // InternalMyDsl.g:619:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SupertypeAssignment_2_1"
    // InternalMyDsl.g:628:1: rule__Entity__SupertypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SupertypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:633:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:633:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:634:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityAccess().getSupertypeEntityCrossReference_2_1_0()); 
            // InternalMyDsl.g:635:3: ( RULE_ID )
            // InternalMyDsl.g:636:4: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getSupertypeEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSupertypeEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSupertypeEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SupertypeAssignment_2_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_4"
    // InternalMyDsl.g:647:1: rule__Entity__FeaturesAssignment_4 : ( ruleFeatures ) ;
    public final void rule__Entity__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:651:1: ( ( ruleFeatures ) )
            // InternalMyDsl.g:652:2: ( ruleFeatures )
            {
            // InternalMyDsl.g:652:2: ( ruleFeatures )
            // InternalMyDsl.g:653:3: ruleFeatures
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeaturesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatures();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeaturesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});

}