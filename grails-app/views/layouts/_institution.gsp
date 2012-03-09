<!--
  To change this template, choose Tools | Templates
  and open the template in the editor.
-->

<div id="search">
<g:form url='[controller: "institution", action: "search"]'
id="institutionSearchForm"
name="institutionSearchForm"
method="get">
<g:textField name="q" value="${params.q}" />
<input type="submit" value="Find an institution" />
</g:form>
</div>